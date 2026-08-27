package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import hh.y9;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.q80;

public final class p6 implements Runnable {

    public final int f13825a;

    public final Object f13826b;

    public final Object f13827c;

    public p6(int i10, Object obj, Object obj2) {
        this.f13825a = i10;
        this.f13826b = obj;
        this.f13827c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        j3 j3Var;
        d4 d4Var;
        int i11;
        int i12 = 8;
        int iIntValue = 0;
        switch (this.f13825a) {
            case 0:
                MessagesController.getInstance(((r6) this.f13826b).I.f13955a).getStoriesController().Z((TL_stories.TL_updateStory) this.f13827c);
                break;
            case 1:
                r6 r6Var = (r6) this.f13826b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f13827c;
                lh.z7 z7Var = r6Var.f13907c;
                z7Var.f17238w = true;
                s6 s6Var = r6Var.I;
                if (s6Var.n(tL_error)) {
                    z7Var.f17240x = null;
                } else {
                    z7Var.f17240x = tL_error;
                }
                r6Var.d = true;
                r6Var.E = true;
                r6Var.D = true;
                s6Var.f13974w.d(z7Var);
                break;
            case 2:
                r6 r6Var2 = (r6) this.f13826b;
                r6Var2.f13907c.c((File) this.f13827c);
                AndroidUtilities.runOnUIThread(new o6(r6Var2, iIntValue));
                break;
            case 3:
                ((u5) this.f13826b).accept((TL_stories.TL_stories_allStories) this.f13827c);
                break;
            case 4:
                f7 f7Var = (f7) this.f13826b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.f13827c;
                MessagesStorage messagesStorage = f7Var.f13332b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem = tL_updateStory.story;
                    int i13 = storyItem.f22617id;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i13, new Object[0]);
                        if (sQLiteCursorQueryFinalized.next()) {
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(0);
                            NativeByteBuffer nativeByteBufferByteBufferValue2 = sQLiteCursorQueryFinalized.byteBufferValue(1);
                            if (nativeByteBufferByteBufferValue != null) {
                                f8.a(TL_stories.StoryItem.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(true), true), nativeByteBufferByteBufferValue2);
                                nativeByteBufferByteBufferValue.reuse();
                            }
                            if (nativeByteBufferByteBufferValue2 != null) {
                                nativeByteBufferByteBufferValue2.reuse();
                            }
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i13).stepThis().dispose();
                        if (z10) {
                            i10 = -1;
                        } else {
                            i10 = 0;
                        }
                    } else if (storyItem instanceof TL_stories.TL_storyItem) {
                        f7Var.l(peerDialogId, storyItem);
                        Locale locale2 = Locale.US;
                        SQLiteCursor sQLiteCursorQueryFinalized2 = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i13, new Object[0]);
                        boolean next = sQLiteCursorQueryFinalized2.next();
                        sQLiteCursorQueryFinalized2.dispose();
                        if (next) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                    } else {
                        i10 = 0;
                    }
                    SQLiteCursor sQLiteCursorQueryFinalized3 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                    iIntValue = sQLiteCursorQueryFinalized3.next() ? sQLiteCursorQueryFinalized3.intValue(1) : 0;
                    sQLiteCursorQueryFinalized3.dispose();
                    Locale locale3 = Locale.US;
                    database.executeFast("UPDATE stories_counter SET count = " + (iIntValue + i10) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
                break;
            case 5:
                f7 f7Var2 = (f7) this.f13826b;
                u5 u5Var = (u5) this.f13827c;
                MessagesStorage messagesStorage2 = f7Var2.f13332b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor sQLiteCursorQueryFinalized4 = database2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (sQLiteCursorQueryFinalized4.next()) {
                        longSparseIntArray.put(sQLiteCursorQueryFinalized4.longValue(0), sQLiteCursorQueryFinalized4.intValue(1));
                    }
                } catch (Exception e9) {
                    messagesStorage2.checkSQLException(e9);
                }
                AndroidUtilities.runOnUIThread(new p6(i12, u5Var, longSparseIntArray));
                break;
            case 6:
                f7.a((f7) this.f13826b, (u5) this.f13827c);
                break;
            case 7:
                ((f7) this.f13826b).j((ArrayList) this.f13827c);
                break;
            case 8:
                ((u5) this.f13826b).f14030b.f13959f = (LongSparseIntArray) this.f13827c;
                break;
            case 9:
                i7 i7Var = (i7) this.f13826b;
                Runnable runnable = (Runnable) this.f13827c;
                if (!i7Var.d) {
                    runnable.run();
                    break;
                }
                break;
            case 10:
                Runnable[] runnableArr = (Runnable[]) this.f13826b;
                i7 i7Var2 = (i7) this.f13827c;
                runnableArr[0] = null;
                i7Var2.f13455c.run();
                g7 g7Var = i7Var2.f13456e;
                if (g7Var != null) {
                    g7Var.onDetachedFromWindow();
                }
                break;
            case 11:
                h7 h7Var = (h7) this.f13826b;
                View view = (View) this.f13827c;
                h7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                }
                nc ncVar = h7Var.H;
                if (ncVar != null) {
                    ncVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                h7Var.N = false;
                h7Var.e();
                break;
            case 12:
                y7 y7Var = (y7) this.f13826b;
                q80 q80Var = (q80) this.f13827c;
                q80 q80Var2 = y7Var.f14156a;
                if (q80Var == q80Var2 && q80Var2 != null) {
                    CharacterStyle characterStyle = q80Var2.f31841i;
                    if (characterStyle instanceof URLSpan) {
                        z7 z7Var2 = y7Var.v;
                        m80 m80Var = y7Var.f14158c;
                        Objects.requireNonNull(m80Var);
                        z7Var2.F.H((URLSpan) characterStyle, z7Var2, new y9(m80Var, 23));
                        y7Var.f14156a = null;
                    }
                    break;
                }
                break;
            case 13:
                m8 m8Var = (m8) this.f13826b;
                lh.w3 w3Var = (lh.w3) this.f13827c;
                m8Var.d.removeView(w3Var);
                if (w3Var == m8Var.f13660c) {
                    m8Var.f13659b = null;
                    m8Var.invalidate();
                    m8Var.b(false);
                }
                break;
            case 14:
                z8 z8Var = (z8) this.f13826b;
                h9 h9Var = (h9) this.f13827c;
                i9 i9Var = z8Var.d;
                e4 currentPeerView = i9Var.f13487j0.getCurrentPeerView();
                if (currentPeerView != null && (j3Var = currentPeerView.Y0) != null && (d4Var = i9Var.C0) != null && d4Var.f13192b == h9Var) {
                    j3Var.invalidate();
                    break;
                }
                break;
            case 15:
                kh.v vVar = (kh.v) this.f13826b;
                String str = (String) this.f13827c;
                ArrayList arrayList = vVar.f15233f;
                while (true) {
                    if (iIntValue >= arrayList.size()) {
                        i11 = -1;
                    } else if (TextUtils.equals(((b6) arrayList.get(iIntValue)).E, str)) {
                        i11 = iIntValue;
                    } else {
                        iIntValue++;
                    }
                }
                if (i11 >= 0) {
                    vVar.f15235r.d(str.hashCode(), i11 + 1);
                }
                break;
            case 16:
                l9.c cVar = (l9.c) this.f13826b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f13827c;
                try {
                    w2.q.a().d.e(cVar.h.f48972a.b(t2.d.f48014c), 1);
                    break;
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                break;
            case 17:
                lh.d dVar = (lh.d) this.f13826b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.f13827c;
                int i14 = dVar.B - 1;
                dVar.B = i14;
                dVar.c(i14, true);
                if (dVar.B <= 0) {
                    dVar.setClickable(true);
                    gVar.run();
                } else {
                    AndroidUtilities.runOnUIThread(dVar.C, 1000L);
                }
                break;
            case 18:
                ((Utilities.Callback) this.f13826b).run((ArrayList) this.f13827c);
                break;
            case 19:
                lh.s1 s1Var = (lh.s1) this.f13826b;
                TLObject tLObject = (TLObject) this.f13827c;
                lh.u1 u1Var = s1Var.f16720s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    lh.l2 l2Var = u1Var.f16901r;
                    MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).putUsers(tL_contacts_resolvedPeer.users, false);
                    MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(((org.telegram.ui.ActionBar.e3) l2Var).currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                s1Var.f16718n = true;
                s1Var.G();
                break;
            case 20:
                ((lh.r2) this.f13826b).e(0.0f, 240L, (Runnable) this.f13827c);
                break;
            case 21:
                lh.f6 f6Var = (lh.f6) this.f13826b;
                View view2 = (View) this.f13827c;
                f6Var.getClass();
                if (view2 instanceof zf.j) {
                    zf.j jVar = (zf.j) view2;
                    jVar.m();
                    f6Var.D0(jVar, true);
                }
                break;
            case 22:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.f13826b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.f13827c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() > 0) {
                        tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                        tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                    }
                } catch (Exception unused3) {
                    return;
                }
                break;
            case 23:
                ((Utilities.Callback) this.f13826b).run((Bitmap) this.f13827c);
                break;
            case 24:
                lh.q6.a((lh.q6) this.f13826b, (lh.z7) this.f13827c);
                break;
            case 25:
                j9.a aVar = (j9.a) this.f13826b;
                lh.z7 z7Var3 = (lh.z7) this.f13827c;
                lh.q6 q6Var = (lh.q6) aVar.d;
                Bitmap bitmap = q6Var.f16558a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (z7Var3.M0 == q6Var.f16558a) {
                        z7Var3.M0 = null;
                    }
                    q6Var.f16558a = null;
                    q6Var.invalidate();
                }
                break;
            case 26:
                lh.u6 u6Var = (lh.u6) this.f13826b;
                Context context = (Context) this.f13827c;
                AtomicReference atomicReference = u6Var.f16907a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.f4317a = 256;
                atomicReference.set(new c8.n(new com.google.android.gms.internal.vision.t2(context, x1Var)));
                u6Var.a(u6Var.f16911f);
                break;
            case 27:
                ((lh.u6) this.f13826b).f16909c.run((lh.s6) this.f13827c);
                break;
            case 28:
                lh.q qVar = (lh.q) this.f13826b;
                zf.c2 c2Var = (zf.c2) this.f13827c;
                lh.c7 c7Var = qVar.f15860a;
                if (c2Var.getWidth() > 0) {
                    float width = c2Var.getWidth() / c7Var.getWidth();
                    ValueAnimator valueAnimator = qVar.f15868w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    qVar.f15868w = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qVar.f15868w.addUpdateListener(new lh.b7(qVar, c7Var.getScaleX(), width, ((c2Var.getWidth() / 2.0f) + c2Var.getX()) - ((c7Var.getWidth() / 2.0f) + c7Var.getX()), ((c2Var.getHeight() / 2.0f) + c2Var.getY()) - ((c7Var.getHeight() / 2.0f) + c7Var.getY()), 0));
                    qVar.f15868w.addListener(new ag.x1(i12, qVar, c2Var));
                    qVar.f15868w.setDuration(320L);
                    qVar.f15868w.setInterpolator(er.h);
                    qVar.v = c2Var;
                    qVar.f15868w.start();
                } else {
                    c7Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new kh.c(qVar, 17)).start();
                }
                break;
            default:
                lh.r7 r7Var = (lh.r7) this.f13826b;
                ArrayList arrayList2 = (ArrayList) this.f13827c;
                r7Var.H0 = false;
                r7Var.X.addAll(arrayList2);
                r7Var.m0.N(true);
                break;
        }
    }
}
