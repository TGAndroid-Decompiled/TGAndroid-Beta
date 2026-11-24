package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class qs1 implements rk1 {
    public final vs1 a;

    public qs1(vs1 vs1Var) {
        this.a = vs1Var;
    }

    @Override
    public final void B(uk1 uk1Var, int i) {
        va7 va7Var = new va7(this, uk1Var, i, (byte) 13);
        mu1 mu1Var = this.a.R;
        if (mu1Var.D0.O) {
            mu1Var.zb(false, true, true);
            gl.d3(va7Var, 80L);
            return;
        }
        va7Var.run();
    }

    @Override
    public final void C(long j) {
        mu1 mu1Var = this.a.R;
        int i = mu1.nd;
        mu1Var.ua(j);
    }

    @Override
    public final void D(uk1 uk1Var) {
        mu1 mu1Var = this.a.R;
        k27 messageObject = uk1Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !uk1Var.getMessageObject().O3() && uk1Var.getMessageObject().X4() && uk1Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var.getResourceProvider(), mu1Var.getParentActivity());
            String M0 = k96.M0(2131746091, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131746092, null);
            alertDialog$Builder.j(k96.M0(2131746128, null), new rh1(this, (byte) 10));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            mu1Var.showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, mu1Var.getResourceProvider());
            }
        }
    }

    @Override
    public final void M(uk1 uk1Var) {
        mu1 mu1Var = this.a.R;
        k27 messageObject = uk1Var.getMessageObject();
        if (messageObject == null || mu1Var.g2 == null) {
            return;
        }
        if (hc2.p0(mu1Var.e)) {
            mu1Var.g2.k(k27.u1(messageObject.k), true);
        } else {
            mu1Var.g2.k(messageObject.Y1(), true);
        }
    }

    @Override
    public final void U(uk1 uk1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i;
        mu1 mu1Var = this.a.R;
        if (str == null) {
            i = ((d) mu1Var).currentAccount;
            xh8 xh8Var = new xh8(mu1Var, i, mu1Var.h(), new mu4(tL_premiumGiftOption), null, mu1Var.Ba);
            xh8Var.E2 = false;
            xh8Var.X1 = uk1Var.getMessageObject().N3();
            mu1Var.showDialog(xh8Var);
            return;
        }
        b(uk1Var);
        c01 c01Var = mu1Var.ec;
        ji8 ji8Var = ji8.N2;
        pt4.Z0(LaunchActivity.Q(), str, c01Var);
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean a0(uk1 uk1Var, float f, float f2) {
        boolean z;
        mu1 mu1Var = this.a.R;
        z = ((d) mu1Var).inPreviewMode;
        if (z) {
            return false;
        }
        return mu1Var.R5(uk1Var, false, false, f, f2, true, true, false);
    }

    public final void b(uk1 uk1Var) {
        pt1 pt1Var;
        mu1 mu1Var = this.a.R;
        c01 c01Var = mu1Var.ec;
        if (c01Var != null) {
            c01Var.a(true);
        }
        if (uk1Var.getMessageObject() == null) {
            pt1Var = null;
        } else {
            pt1Var = new pt1(this, uk1Var, (byte) 6);
        }
        mu1Var.ec = pt1Var;
    }

    @Override
    public final long d() {
        return this.a.R.d();
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final void m(uk1 uk1Var) {
        mq1 mq1Var;
        mu1 mu1Var = this.a.R;
        k27 messageObject = uk1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.M1 = true;
        jq1 jq1Var = mu1Var.A0;
        if (jq1Var != null && (mq1Var = mu1Var.C0) != null && mq1Var.y < 0) {
            int childCount = jq1Var.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = mu1Var.A0.getChildAt(childCount);
                mu1Var.A0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof gb2) {
                        if (((gb2) childAt).getCurrentMessagesGroup() == null) {
                            mu1Var.a7(childAt);
                            break;
                        }
                    } else if (childAt instanceof uk1) {
                        mu1Var.a7(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        mu1Var.Nc(messageObject, false);
    }

    @Override
    public final void n(uk1 uk1Var, String str) {
        b(uk1Var);
        mu1 mu1Var = this.a.R;
        pt4.Z0(mu1Var, str, mu1Var.ec);
    }

    @Override
    public final void o(uk1 uk1Var, int i, int i2) {
        mp1 mp1Var = new mp1(this, uk1Var, i, i2, (byte) 1);
        mu1 mu1Var = this.a.R;
        if (mu1Var.D0.O) {
            mu1Var.zb(false, true, true);
            gl.d3(mp1Var, 80L);
            return;
        }
        mp1Var.run();
    }

    @Override
    public final void r(uk1 uk1Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        boolean z;
        int i;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        k27 messageObject = uk1Var.getMessageObject();
        PhotoViewer r0 = PhotoViewer.r0();
        mu1 mu1Var = this.a.R;
        r0.T1(null, mu1Var, mu1Var.Ba);
        boolean z2 = false;
        TLRPC.PhotoSize w = ba4.w(messageObject.p0, 640, false, null, false);
        if (uk1Var.getMessageObject().D == 24) {
            m8b orCreateStoryViewer = mu1Var.getOrCreateStoryViewer();
            jq1 jq1Var = mu1Var.A0;
            orCreateStoryViewer.getClass();
            k27 messageObject2 = uk1Var.getMessageObject();
            if (mu1Var.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = cf3.n(messageMedia.peer);
                storyItem.messageId = messageObject2.e1();
                orCreateStoryViewer.J(mu1Var.getParentActivity(), messageObject2.k.media.storyItem, p2b.a(jq1Var));
            }
        } else if (uk1Var.getMessageObject().D == 22) {
            i = ((d) mu1Var).currentAccount;
            na7 q1 = na7.q1(i);
            RadialProgress2 radialProgress2 = uk1Var.K1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.e1() < 0 && (str = q1.J2) != null && TextUtils.equals(messageObject.k.action.wallpaper.uploadingImage, str)) {
                vjb vjbVar = q1.K2;
                if (vjbVar != null) {
                    if (vjbVar.s != null) {
                        for (int i2 = 0; i2 < q1.K2.s.size(); i2++) {
                            ConnectionsManager.getInstance(q1.currentAccount).cancelRequest(((Integer) q1.K2.s.get(i2)).intValue(), true);
                        }
                    }
                    ba4.G(q1.currentAccount).b(q1.J2, false);
                    long j = q1.K2.n;
                    int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i3 != 0) {
                        if (i3 >= 0) {
                            TLRPC.UserFull W1 = q1.W1(j);
                            if (W1 != null) {
                                W1.wallpaper = q1.K2.t;
                                kk7.f(q1.currentAccount).k(67, Long.valueOf(q1.K2.n), W1);
                            }
                        } else {
                            TLRPC.ChatFull L0 = q1.L0(-j);
                            if (L0 != null) {
                                L0.wallpaper = q1.K2.t;
                                kk7 f = kk7.f(q1.currentAccount);
                                Boolean bool = Boolean.FALSE;
                                f.k(30, L0, 0, bool, bool);
                            }
                        }
                    }
                    q1.K2 = null;
                    q1.J2 = null;
                }
                mu1Var.Qa(messageObject);
                return;
            }
            k27 k27Var = uk1Var.Q0;
            if (k27Var != null && uk1Var.X(k27Var) && uk1Var.y1 != null) {
                TLRPC.MessageAction messageAction = messageObject.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        krc krcVar = new krc(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, gl.q1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion);
                        wallPaper = krcVar;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            krcVar.g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = krcVar;
                        }
                    }
                    boolean o = bkb.I.o();
                    amb ambVar = new amb(wallPaper, mu1Var, o);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z3 = wallPaperSettings3.blur;
                        boolean z4 = wallPaperSettings3.motion;
                        ambVar.H1 = z3;
                        ambVar.G1 = z4;
                        ambVar.p1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    ambVar.s0 = messageObject;
                    ambVar.g1(k27.B0(messageObject.k));
                    ambVar.a.a = mu1Var.Ba;
                    ambVar.r1 = new bmb(mu1Var, o);
                    mu1Var.presentFragment(ambVar);
                    return;
                }
                return;
            }
            mu1Var.Nb();
        } else {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.k.action.photo.video_sizes;
            if (arrayList != null && !arrayList.isEmpty()) {
                videoSize = ba4.x(1000, messageObject.k.action.photo.video_sizes);
                ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.k.action.photo.video_sizes;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    if ((arrayList2.get(i4) instanceof TLRPC.TL_videoSizeEmojiMarkup) || (arrayList2.get(i4) instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                        videoSize2 = arrayList2.get(i4);
                        break;
                    }
                }
                videoSize2 = null;
            } else {
                videoSize = null;
                videoSize2 = null;
            }
            if (uk1Var.getMessageObject().D == 21 && !messageObject.O3()) {
                if (!messageObject.q) {
                    if (videoSize2 != null) {
                        wl5 wl5Var = new wl5(0, true, true);
                        wl5Var.a = mu1Var;
                        wl5Var.d();
                        wl5Var.c.d2.u0(null, videoSize2, 0L);
                        wl5Var.b = new qm1(mu1Var, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], mu1Var.getUserConfig().e(), (byte) 5);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    gl5.j(videoSize, messageObject.k.action.photo);
                    ba4 fileLoader = mu1Var.getFileLoader();
                    if (videoSize == null) {
                        TLRPC.Photo photo = messageObject.k.action.photo;
                        fileLoader.getClass();
                        I = ba4.I(photo);
                    } else {
                        fileLoader.getClass();
                        I = ba4.I(videoSize);
                    }
                    File file = new File(ba4.z(4), I.getName());
                    if (!I.exists()) {
                        if (file.exists()) {
                            I = file;
                        } else {
                            return;
                        }
                    }
                    jm6 jm6Var = new jm6(0, I.getAbsolutePath(), 0, false, 0, 0);
                    jm6Var.a = mu1Var.a0.getFieldText();
                    if (videoSize != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jm6Var.b = z;
                    arrayList3.add(jm6Var);
                    PhotoViewer.r0().o1(arrayList3, 0, 1, false, new ps1(this, messageObject, jm6Var), null);
                    if (jm6Var.b) {
                        PhotoViewer.r0().X1(k96.M0(2131744131, null));
                    } else {
                        PhotoViewer.r0().X1(k96.M0(2131744134, null));
                    }
                    ul5 ul5Var = new ul5(1, mu1Var.getUserConfig().f());
                    if (videoSize != null) {
                        z2 = true;
                    }
                    ul5Var.e = z2;
                    ul5Var.b = mu1Var.getMessagesController().V1(Long.valueOf(mu1Var.l6));
                    PhotoViewer.r0().G1(ul5Var);
                }
            } else if (videoSize != null) {
                PhotoViewer.r0().l1(videoSize.location, gl5.j(videoSize, messageObject.k.action.photo), mu1Var.db);
                if (uk1Var.getMessageObject().D == 21) {
                    PhotoViewer.r0().X1(k96.M0(2131744131, null));
                }
            } else if (w != null) {
                PhotoViewer.r0().l1(w.location, gl5.i(w, messageObject.k.action.photo), mu1Var.db);
                if (uk1Var.getMessageObject().D == 21) {
                    PhotoViewer.r0().X1(k96.M0(2131744134, null));
                }
            } else {
                PhotoViewer.r0().m1(messageObject, null, 0L, 0L, 0L, mu1Var.db);
            }
        }
    }

    @Override
    public final void u(uk1 uk1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        kr1 kr1Var = this.a.R.Ua;
        FrameLayout frameLayout = kr1Var.H;
        HashMap hashMap = kr1Var.f;
        Random random = kr1Var.h;
        ArrayList arrayList = kr1Var.G;
        if (arrayList.size() <= 12 && uk1Var.getPhotoImage().E()) {
            float f = uk1Var.getPhotoImage().O0;
            float f2 = uk1Var.getPhotoImage().N0;
            if (f > 0.0f && f2 > 0.0f) {
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (((yu3) arrayList.get(i3)).p == uk1Var.getMessageObject().e1()) {
                        i++;
                        if (((yu3) arrayList.get(i3)).r.y() == null || ((yu3) arrayList.get(i3)).r.y().t()) {
                            return;
                        }
                    }
                    if (((yu3) arrayList.get(i3)).q != null && document != null && ((yu3) arrayList.get(i3)).q.id == document.id) {
                        i2++;
                    }
                }
                if (i < 4) {
                    yu3 yu3Var = new yu3();
                    yu3Var.h = true;
                    if (!yu3Var.i) {
                        yu3Var.f = ((random.nextInt() % 101) / 100.0f) * (f2 / 4.0f);
                        yu3Var.g = ((random.nextInt() % 101) / 100.0f) * (f / 4.0f);
                    }
                    yu3Var.p = uk1Var.getMessageObject().e1();
                    yu3Var.m = true;
                    ImageReceiver imageReceiver = yu3Var.r;
                    imageReceiver.u0 = true;
                    int f3 = zu3.f();
                    if (i2 > 0) {
                        Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                        StringBuilder sb = new StringBuilder();
                        sb.append(intValue);
                        sb.append("_");
                        imageReceiver.w1 = de9.l(sb, yu3Var.p, "_");
                    }
                    yu3Var.q = document;
                    yu3Var.r.d0(gl5.d(videoSize, document), tb4.m(f3, f3, "_"), null, "tgs", kr1Var.c, 1);
                    imageReceiver.m0(Integer.MAX_VALUE);
                    imageReceiver.M(0);
                    if (imageReceiver.y() != null) {
                        if (yu3Var.h) {
                            imageReceiver.y().I(0, false, true);
                        }
                        imageReceiver.y().start();
                    }
                    arrayList.add(yu3Var);
                    if (kr1Var.n) {
                        imageReceiver.I();
                        imageReceiver.p0(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final d v() {
        return this.a.R;
    }

    @Override
    public final void y(uk1 uk1Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        this.a.R.h6(uk1Var, reactionCount, z, f, f2);
    }

    @Override
    public final void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
