package ah;

import a0.h;
import af.g;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c2.z0;
import cg.d1;
import cg.l;
import cg.s1;
import dg.e1;
import dg.f3;
import dg.o1;
import dg.o2;
import h5.j;
import j3.q1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import k7.b6;
import lh.b4;
import lh.d4;
import lh.e4;
import lh.f4;
import lh.j7;
import lh.s4;
import lh.t7;
import lh.v4;
import lh.y3;
import mg.p;
import mg.s;
import nh.i9;
import nh.y8;
import nh.z8;
import o4.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.voip.f2;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bm;
import org.telegram.ui.ch;
import org.telegram.ui.j4;
import org.telegram.ui.jm;
import org.telegram.ui.ka0;
import org.telegram.ui.l4;
import org.telegram.ui.xn;
import rh.k;
public final class a implements Runnable {
    public final int f191a;
    public final int f192b;
    public final Object f193c;
    public final Object d;

    public a(int i10, Object obj, Object obj2, int i11) {
        this.f191a = i11;
        this.f192b = i10;
        this.f193c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z4;
        int i10;
        String str = null;
        UndoView undoView = null;
        boolean z10 = true;
        int i11 = 0;
        switch (this.f191a) {
            case 0:
                ((View) this.d).postOnAnimation(new af.b((b) this.f193c, this.f192b, 1));
                return;
            case 1:
                d1 d1Var = (d1) this.f193c;
                d1Var.e((s1) this.d, this.f192b, d1Var.h);
                d1Var.h = null;
                return;
            case 2:
                e1 e1Var = (e1) this.f193c;
                l lVar = (l) this.d;
                int i12 = this.f192b;
                if (e1Var.T0.getCurrentBrush() instanceof l) {
                    e1Var.f4471h1 = true;
                }
                e1Var.x(lVar);
                o2 o2Var = e1Var.f4483q1;
                int i13 = o2Var.d + 1;
                o2Var.a(i13);
                AndroidUtilities.updateImageViewImageAnimated(o2Var.f4691a[i13], i12);
                o2Var.e = true;
                return;
            case 3:
                ((e2.d) ((z0) this.f193c).f2048c).v(this.f192b, this.d);
                return;
            case 4:
                int i14 = this.f192b;
                j jVar = (j) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f193c).iterator();
                while (it.hasNext()) {
                    h5.l lVar2 = (h5.l) it.next();
                    if (!lVar2.d) {
                        if (i14 != -1) {
                            lVar2.f6958b.b(i14);
                        }
                        lVar2.f6959c = true;
                        jVar.invoke(lVar2.f6957a);
                    }
                }
                return;
            case 5:
                Pair pair = (Pair) this.d;
                ((q1) ((f7.b) this.f193c).f6013c).h.c(((Integer) pair.first).intValue(), (v) pair.second, this.f192b);
                return;
            case 6:
                or0 or0Var = (or0) this.f193c;
                int i15 = this.f192b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                j7 j7Var = or0Var.e;
                if (i15 != -1) {
                    int i16 = tL_starGiftCollection.collection_id;
                    int i17 = j7Var.f12670a;
                    int f10 = j7Var.f(i16);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) j7Var.e.remove(f10);
                        j7Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i17).getInputPeer(j7Var.f12671b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i17).sendRequest(deletestargiftcollection, null);
                    }
                    or0Var.f(true);
                    k81 k81Var = or0Var.f10943n;
                    if (i15 < j7Var.d().size()) {
                        i15++;
                    }
                    k81Var.d(-1, i15);
                    or0Var.n();
                    return;
                }
                return;
            case 7:
                f4 f4Var = (f4) this.f193c;
                int i18 = this.f192b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = f4Var.S;
                b4 b4Var = f4Var.f12412f;
                y3 y3Var = f4Var.h;
                if (starGift != null) {
                    d4 d4Var = new d4(f4Var.getContext());
                    d4Var.a(starGift, false);
                    d4Var.setRotation(180.0f);
                    y3Var.f(i18, d4Var);
                    d4Var.setScaleX(0.5f);
                    d4Var.setScaleY(0.5f);
                    d4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = d4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    nr nrVar = nr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(nrVar);
                    interpolator.setUpdateListener(new o1(f4Var, 12));
                    interpolator.start();
                    y3Var.f13382a[i18].setVisibility(8);
                    b4Var.setVisibility(0);
                    b4Var.setAlpha(0.0f);
                    b4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(nrVar).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(f4Var.getContext());
                ?? imageView = new ImageView(f4Var.getContext());
                imageView.f(R.raw.gift_broken, 32, 32, null);
                frameLayout.addView((View) imageView, b6.e(32, 32, 17));
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                f4Var.f12416i0 = imageView;
                frameLayout.setBackground(new s4(AndroidUtilities.dp(12.0f), j6.l1(0.075f, -1)));
                y3Var.f13382a[i18].setVisibility(8);
                frameLayout.setRotation(180.0f);
                y3Var.f(i18, frameLayout);
                f4Var.C.a(iArr[2], iArr[3]);
                e4 e4Var = f4Var.f12406b;
                int[] iArr2 = f4Var.R;
                e4Var.a(iArr2[2], iArr2[3]);
                b4Var.a(iArr[3], iArr[2]);
                return;
            case 8:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, k.G0(this.f192b)), (v4) this.f193c, Boolean.FALSE);
                return;
            case 9:
                t7 t7Var = (t7) this.f193c;
                int i19 = this.f192b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = t7Var.f13163r;
                ArrayList[] arrayListArr = t7Var.f13162q;
                int i20 = t7Var.f13149a;
                t7Var.f13165t[i19] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i20).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i20).putChats(starsStatus.chats, false);
                    arrayListArr[i19].addAll(starsStatus.history);
                    if (arrayListArr[i19].isEmpty() && !zArr[i19]) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    zArr[i19] = z4;
                    boolean[] zArr2 = t7Var.f13166u;
                    if ((starsStatus.flags & 1) != 0) {
                        z10 = false;
                    }
                    zArr2[i19] = z10;
                    String[] strArr = t7Var.f13164s;
                    if (!z10) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i19] = str;
                    t7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 10:
                int i21 = this.f192b;
                g.s((Context) this.f193c, "https://" + MessagesController.getInstance(i21).linkPrefix + "/nft/" + ((String) this.d));
                return;
            case 11:
                s sVar = (s) this.f193c;
                u5 u5Var = (u5) this.d;
                int i22 = this.f192b;
                Editable text = sVar.f14139n.getText();
                int spanStart = text.getSpanStart(u5Var);
                int spanEnd = text.getSpanEnd(u5Var);
                int i23 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    sVar.f14139n.getText().delete(spanStart, spanEnd);
                    p pVar = sVar.f14139n;
                    pVar.setSelection(Math.min(i22 - i23, pVar.getText().length()));
                    return;
                }
                return;
            case 12:
                ((nh.e1) this.f193c).C.put((String) this.d, Integer.valueOf(this.f192b));
                return;
            case 13:
                TLObject tLObject2 = (TLObject) this.f193c;
                int i24 = this.f192b;
                ka0 ka0Var = (ka0) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i11);
                        i11++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i24) {
                            ka0Var.accept(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                ka0Var.accept(null);
                return;
            case 14:
                int i25 = this.f192b;
                i9 i9Var = ((z8) this.f193c).d;
                y8 y8Var = i9Var.f15472k0;
                int i26 = i9Var.h;
                y8Var.f15849x0 = (ArrayList) this.d;
                y8Var.f15847v0 = i26;
                y8Var.setAdapter(null);
                y8Var.setAdapter(y8Var.f15848w0);
                y8Var.setCurrentItem(i25);
                y8Var.f15851z0 = true;
                return;
            case 15:
                o3.l lVar3 = (o3.l) this.f193c;
                this.d.c(lVar3.f16269a, lVar3.f16270b, this.f192b);
                return;
            case 16:
                ((CameraView) this.f193c).lambda$createCamera$13(this.f192b, (SurfaceTexture) this.d);
                return;
            case 17:
                NativeInstance.a((NativeInstance) this.f193c, this.f192b, (String) this.d);
                return;
            case 18:
                ((VoIPService) this.f193c).lambda$createGroupInstance$74((String) this.d, this.f192b);
                return;
            case 19:
                int i27 = this.f192b;
                Context context = (Context) this.f193c;
                g3[] g3VarArr = (g3[]) this.d;
                String str2 = MessagesController.getInstance(i27).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                g.s(context, str2);
                g3VarArr[0].dismiss();
                return;
            case 20:
                l4 l4Var = (l4) this.f193c;
                String str3 = (String) this.d;
                int i28 = this.f192b;
                HashMap hashMap = new HashMap(l4Var.f35945r0[0].f37160c.f35228w);
                ArrayList arrayList2 = new ArrayList(l4Var.f35945r0[0].f37160c.f35229x);
                l4Var.S0 = null;
                Utilities.searchQueue.postRunnable(new f3(l4Var, arrayList2, hashMap, str3, i28));
                return;
            case 21:
                l4 l4Var2 = (l4) this.f193c;
                int i29 = this.f192b;
                af.f fVar = (af.f) this.d;
                if (l4Var2.E0 == i29 && l4Var2.C0 != 0) {
                    ConnectionsManager.getInstance(l4Var2.U).cancelRequest(l4Var2.C0, false);
                    l4Var2.C0 = 0;
                }
                if (l4Var2.J0 == fVar) {
                    l4Var2.J0 = null;
                    return;
                }
                return;
            case 22:
                int i30 = this.f192b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f193c;
                MessagesController.getInstance(i30).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i30).openGuardBotWebApp(-((TLRPC.Chat) this.d).f19184id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 23:
                j4 j4Var = (j4) this.f193c;
                j4Var.G = this.f192b;
                j4Var.F = (int[]) this.d;
                j4Var.I.f0();
                return;
            case 24:
                int i31 = this.f192b;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.f193c);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                f2.h(LaunchActivity.D1, i31, tL_inputGroupCallSlug, false, null, null);
                ((g3[]) this.d)[0].dismiss();
                return;
            case 25:
                ((xn) this.f193c).Ka((ArrayList) this.d, this.f192b, false, false);
                return;
            case 26:
                int i32 = this.f192b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ((xn) this.f193c).f40193u0.v0(0, i32, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new ch(0, editTextBoldCursor), 100L);
                return;
            case 27:
                bm bmVar = (bm) this.f193c;
                int i33 = this.f192b;
                bmVar.getClass();
                MessageObject messageObject = ((v0) this.d).getMessageObject();
                jm jmVar = bmVar.f32984a;
                xn xnVar = jmVar.N;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == jmVar.N.I6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                xnVar.j(i33, id2, true, i10, true, 0);
                return;
            case 28:
                qn qnVar = (qn) this.f193c;
                int i34 = this.f192b;
                View view = (View) this.d;
                qnVar.S = 0;
                qnVar.R = i34;
                if (view instanceof o8) {
                    qnVar.U((o8) view, true);
                    return;
                } else {
                    qnVar.f28186r.m(qnVar.F0);
                    return;
                }
            default:
                h hVar = (h) this.d;
                int i35 = this.f192b;
                p2 p2Var = ((zu) this.f193c).Y0.f27124c;
                if (p2Var instanceof xn) {
                    xn xnVar2 = (xn) p2Var;
                    xnVar2.Q7();
                    undoView = xnVar2.f40209v3;
                } else if (p2Var instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) p2Var).J;
                }
                UndoView undoView2 = undoView;
                if (undoView2 != null) {
                    if (hVar.m() == 1) {
                        undoView2.m(((TLRPC.Dialog) hVar.n(0)).f19188id, Integer.valueOf(i35), 53);
                        return;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i35), Integer.valueOf(hVar.m()), null, null);
                        return;
                    }
                }
                return;
        }
    }

    public a(Object obj, int i10, Object obj2, int i11) {
        this.f191a = i11;
        this.f193c = obj;
        this.f192b = i10;
        this.d = obj2;
    }

    public a(Object obj, Object obj2, int i10, int i11) {
        this.f191a = i11;
        this.f193c = obj;
        this.d = obj2;
        this.f192b = i10;
    }

    public a(j4 j4Var, int i10, int[] iArr, int[] iArr2) {
        this.f191a = 23;
        this.f193c = j4Var;
        this.f192b = i10;
        this.d = iArr2;
    }
}
