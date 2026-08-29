package ag;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bg.j3;
import bg.r2;
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import jh.c4;
import jh.e4;
import jh.f4;
import jh.g4;
import jh.i7;
import jh.s7;
import jh.t4;
import jh.w4;
import jh.z3;
import lh.i9;
import lh.y8;
import lh.z8;
import nh.jb;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.y71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.ca0;
import org.telegram.ui.em;
import org.telegram.ui.k4;
import org.telegram.ui.m4;
import org.telegram.ui.tn;
import org.telegram.ui.vl;
import org.telegram.ui.xg;
public final class v0 implements Runnable {
    public final int f682a;
    public final int f683b;
    public final Object f684c;
    public final Object d;

    public v0(int i10, Object obj, Object obj2, int i11) {
        this.f682a = i11;
        this.f683b = i10;
        this.f684c = obj;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        String str = null;
        boolean z11 = true;
        int i11 = 0;
        switch (this.f682a) {
            case 0:
                f1 f1Var = (f1) this.f684c;
                f1Var.e((w1) this.d, this.f683b, f1Var.h);
                f1Var.h = null;
                return;
            case 1:
                bg.g1 g1Var = (bg.g1) this.f684c;
                l lVar = (l) this.d;
                int i12 = this.f683b;
                if (g1Var.S0.getCurrentBrush() instanceof l) {
                    g1Var.f2235g1 = true;
                }
                g1Var.q(lVar);
                r2 r2Var = g1Var.f2247p1;
                int i13 = r2Var.d + 1;
                r2Var.a(i13);
                AndroidUtilities.updateImageViewImageAnimated(r2Var.f2470a[i13], i12);
                r2Var.f2473e = true;
                return;
            case 2:
                ((e2.c) ((c2.b1) this.f684c).f2793c).l0(this.f683b, this.d);
                return;
            case 3:
                int i14 = this.f683b;
                f5.j jVar = (f5.j) this.d;
                Iterator it = ((CopyOnWriteArraySet) this.f684c).iterator();
                while (it.hasNext()) {
                    f5.l lVar2 = (f5.l) it.next();
                    if (!lVar2.d) {
                        if (i14 != -1) {
                            lVar2.f6599b.b(i14);
                        }
                        lVar2.f6600c = true;
                        jVar.invoke(lVar2.f6598a);
                    }
                }
                return;
            case 4:
                gr0 gr0Var = (gr0) this.f684c;
                int i15 = this.f683b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                i7 i7Var = gr0Var.f9504e;
                if (i15 != -1) {
                    int i16 = tL_starGiftCollection.collection_id;
                    int i17 = i7Var.f12259a;
                    int f9 = i7Var.f(i16);
                    if (f9 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) i7Var.f12262e.remove(f9);
                        i7Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i17).getInputPeer(i7Var.f12260b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i17).sendRequest(deletestargiftcollection, null);
                    }
                    gr0Var.f(true);
                    y71 y71Var = gr0Var.f9506n;
                    if (i15 < i7Var.d().size()) {
                        i15++;
                    }
                    y71Var.d(-1, i15);
                    gr0Var.n();
                    return;
                }
                return;
            case 5:
                g4 g4Var = (g4) this.f684c;
                int i18 = this.f683b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = g4Var.R;
                c4 c4Var = g4Var.f12107f;
                z3 z3Var = g4Var.h;
                if (starGift != null) {
                    e4 e4Var = new e4(g4Var.getContext());
                    e4Var.a(starGift, false);
                    e4Var.setRotation(180.0f);
                    z3Var.f(i18, e4Var);
                    e4Var.setScaleX(0.5f);
                    e4Var.setScaleY(0.5f);
                    e4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = e4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    jr jrVar = jr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(jrVar);
                    interpolator.setUpdateListener(new bg.q1(g4Var, 12));
                    interpolator.start();
                    z3Var.f13158a[i18].setVisibility(8);
                    c4Var.setVisibility(0);
                    c4Var.setAlpha(0.0f);
                    c4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(jrVar).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(g4Var.getContext());
                ?? imageView = new ImageView(g4Var.getContext());
                imageView.f(R.raw.gift_broken, 32, 32, null);
                frameLayout.addView((View) imageView, f6.e(32, 32, 17));
                imageView.setScaleX(0.5f);
                imageView.setScaleY(0.5f);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                g4Var.f12110h0 = imageView;
                frameLayout.setBackground(new t4(AndroidUtilities.dp(12.0f), g6.l1(0.075f, -1)));
                z3Var.f13158a[i18].setVisibility(8);
                frameLayout.setRotation(180.0f);
                z3Var.f(i18, frameLayout);
                g4Var.B.a(iArr[2], iArr[3]);
                f4 f4Var = g4Var.f12100b;
                int[] iArr2 = g4Var.Q;
                f4Var.a(iArr2[2], iArr2[3]);
                c4Var.a(iArr[3], iArr[2]);
                return;
            case 6:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, ph.j.G0(this.f683b)), (w4) this.f684c, Boolean.FALSE);
                return;
            case 7:
                s7 s7Var = (s7) this.f684c;
                int i19 = this.f683b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = s7Var.f12802r;
                ArrayList[] arrayListArr = s7Var.f12801q;
                int i20 = s7Var.f12787a;
                s7Var.f12804t[i19] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i20).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i20).putChats(starsStatus.chats, false);
                    arrayListArr[i19].addAll(starsStatus.history);
                    if (arrayListArr[i19].isEmpty() && !zArr[i19]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr[i19] = z10;
                    boolean[] zArr2 = s7Var.f12805u;
                    if ((starsStatus.flags & 1) != 0) {
                        z11 = false;
                    }
                    zArr2[i19] = z11;
                    String[] strArr = s7Var.f12803s;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i19] = str;
                    s7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    return;
                }
                return;
            case 8:
                int i21 = this.f683b;
                ye.d.s((Context) this.f684c, "https://" + MessagesController.getInstance(i21).linkPrefix + "/nft/" + ((String) this.d));
                return;
            case 9:
                kg.s sVar = (kg.s) this.f684c;
                y5 y5Var = (y5) this.d;
                int i22 = this.f683b;
                Editable text = sVar.f13859n.getText();
                int spanStart = text.getSpanStart(y5Var);
                int spanEnd = text.getSpanEnd(y5Var);
                int i23 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    sVar.f13859n.getText().delete(spanStart, spanEnd);
                    kg.p pVar = sVar.f13859n;
                    pVar.setSelection(Math.min(i22 - i23, pVar.getText().length()));
                    return;
                }
                return;
            case 10:
                ((lh.d1) this.f684c).B.put((String) this.d, Integer.valueOf(this.f683b));
                return;
            case 11:
                TLObject tLObject2 = (TLObject) this.f684c;
                int i24 = this.f683b;
                ca0 ca0Var = (ca0) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i11);
                        i11++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i24) {
                            ca0Var.accept(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                ca0Var.accept(null);
                return;
            case 12:
                int i25 = this.f683b;
                i9 i9Var = ((z8) this.f684c).d;
                y8 y8Var = i9Var.f15765j0;
                int i26 = i9Var.h;
                y8Var.f16182w0 = (ArrayList) this.d;
                y8Var.f16180u0 = i26;
                y8Var.setAdapter(null);
                y8Var.setAdapter(y8Var.f16181v0);
                y8Var.setCurrentItem(i25);
                y8Var.f16184y0 = true;
                return;
            case 13:
                FfmpegAudioWaveformLoader.c((FfmpegAudioWaveformLoader) this.f684c, (String) this.d, this.f683b);
                return;
            case 14:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.f684c, (short[]) this.d, this.f683b);
                return;
            case 15:
                t5 t5Var = (t5) this.f684c;
                l lVar3 = (l) this.d;
                int i27 = this.f683b;
                if (t5Var.K0.getCurrentBrush() instanceof l) {
                    t5Var.Y0 = true;
                }
                t5Var.q(lVar3);
                r2 r2Var2 = t5Var.f18634g1;
                int i28 = r2Var2.d + 1;
                r2Var2.a(i28);
                AndroidUtilities.updateImageViewImageAnimated(r2Var2.f2470a[i28], i27);
                r2Var2.f2473e = true;
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new bg.f(this.f683b, ((MessagesStorage) this.f684c).getUsers(new ArrayList<>((HashSet) this.d)), 13));
                return;
            case 17:
                ((jb) this.f684c).b((short[]) this.d, this.f683b);
                return;
            case 18:
                ((CameraView) this.f684c).lambda$createCamera$13(this.f683b, (SurfaceTexture) this.d);
                return;
            case 19:
                ((NativeInstance) this.f684c).lambda$onEmitJoinPayload$3(this.f683b, (String) this.d);
                return;
            case 20:
                ((VoIPService) this.f684c).lambda$createGroupInstance$74((String) this.d, this.f683b);
                return;
            case 21:
                int i29 = this.f683b;
                Context context = (Context) this.f684c;
                f3[] f3VarArr = (f3[]) this.d;
                String str2 = MessagesController.getInstance(i29).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                ye.d.s(context, str2);
                f3VarArr[0].dismiss();
                return;
            case 22:
                m4 m4Var = (m4) this.f684c;
                String str3 = (String) this.d;
                int i30 = this.f683b;
                HashMap hashMap = new HashMap(m4Var.f40404q0[0].f41514c.f39746w);
                ArrayList arrayList2 = new ArrayList(m4Var.f40404q0[0].f41514c.f39747x);
                m4Var.R0 = null;
                Utilities.searchQueue.postRunnable(new j3(m4Var, arrayList2, hashMap, str3, i30));
                return;
            case 23:
                m4 m4Var2 = (m4) this.f684c;
                int i31 = this.f683b;
                ye.c cVar = (ye.c) this.d;
                if (m4Var2.D0 == i31 && m4Var2.B0 != 0) {
                    ConnectionsManager.getInstance(m4Var2.T).cancelRequest(m4Var2.B0, false);
                    m4Var2.B0 = 0;
                }
                if (m4Var2.I0 == cVar) {
                    m4Var2.I0 = null;
                    return;
                }
                return;
            case 24:
                int i32 = this.f683b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.f684c;
                MessagesController.getInstance(i32).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i32).openGuardBotWebApp(-((TLRPC.Chat) this.d).f22392id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                return;
            case 25:
                k4 k4Var = (k4) this.f684c;
                k4Var.F = this.f683b;
                k4Var.E = (int[]) this.d;
                k4Var.H.f0();
                return;
            case 26:
                int i33 = this.f683b;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse((String) this.f684c);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.h2.h(LaunchActivity.C1, i33, tL_inputGroupCallSlug, false, null, null);
                ((f3[]) this.d)[0].dismiss();
                return;
            case 27:
                ((tn) this.f684c).Ka((ArrayList) this.d, this.f683b, false, false);
                return;
            case 28:
                int i34 = this.f683b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                ((tn) this.f684c).f42973t0.v0(0, i34, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new xg(0, editTextBoldCursor), 100L);
                return;
            default:
                vl vlVar = (vl) this.f684c;
                int i35 = this.f683b;
                vlVar.getClass();
                MessageObject messageObject = ((org.telegram.ui.Cells.v0) this.d).getMessageObject();
                em emVar = vlVar.f43618a;
                tn tnVar = emVar.M;
                int id2 = messageObject.getId();
                if (messageObject.getDialogId() == emVar.M.H6) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                tnVar.j(i35, id2, true, i10, true, 0);
                return;
        }
    }

    public v0(Object obj, int i10, Object obj2, int i11) {
        this.f682a = i11;
        this.f684c = obj;
        this.f683b = i10;
        this.d = obj2;
    }

    public v0(Object obj, Object obj2, int i10, int i11) {
        this.f682a = i11;
        this.f684c = obj;
        this.d = obj2;
        this.f683b = i10;
    }

    public v0(k4 k4Var, int i10, int[] iArr, int[] iArr2) {
        this.f682a = 25;
        this.f684c = k4Var;
        this.f683b = i10;
        this.d = iArr2;
    }
}
