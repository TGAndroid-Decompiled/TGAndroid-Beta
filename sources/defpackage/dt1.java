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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class dt1 implements al1 {
    public final it1 a;

    public dt1(it1 it1Var) {
        this.a = it1Var;
    }

    @Override
    public final void B(dl1 dl1Var, int i) {
        ze7 ze7Var = new ze7(this, dl1Var, i, (byte) 13);
        zu1 zu1Var = this.a.R;
        if (zu1Var.D0.O) {
            zu1Var.Kb(false, true, true);
            hl.d3(ze7Var, 80L);
            return;
        }
        ze7Var.run();
    }

    @Override
    public final void I(long j) {
        zu1 zu1Var = this.a.R;
        int i = zu1.Ad;
        zu1Var.Fa(j);
    }

    @Override
    public final void J(dl1 dl1Var) {
        zu1 zu1Var = this.a.R;
        r47 messageObject = dl1Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !dl1Var.getMessageObject().O3() && dl1Var.getMessageObject().X4() && dl1Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, zu1Var.getResourceProvider(), zu1Var.getParentActivity());
            String M0 = ob6.M0(2131746011, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131746012, null);
            alertDialog$Builder.j(ob6.M0(2131746048, null), new rd1(this, (byte) 12));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            zu1Var.showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, zu1Var.getResourceProvider());
            }
        }
    }

    @Override
    public final void X(dl1 dl1Var) {
        zu1 zu1Var = this.a.R;
        r47 messageObject = dl1Var.getMessageObject();
        if (messageObject == null || zu1Var.g2 == null) {
            return;
        }
        if (xc2.p0(zu1Var.e)) {
            zu1Var.g2.k(r47.u1(messageObject.k), true);
        } else {
            zu1Var.g2.k(messageObject.Y1(), true);
        }
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final void b(dl1 dl1Var) {
        cu1 cu1Var;
        zu1 zu1Var = this.a.R;
        l01 l01Var = zu1Var.pc;
        if (l01Var != null) {
            l01Var.a(true);
        }
        if (dl1Var.getMessageObject() == null) {
            cu1Var = null;
        } else {
            cu1Var = new cu1(this, dl1Var, (byte) 6);
        }
        zu1Var.pc = cu1Var;
    }

    @Override
    public final long c() {
        return this.a.R.c();
    }

    @Override
    public final void f0(dl1 dl1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i;
        zu1 zu1Var = this.a.R;
        if (str == null) {
            i = ((e) zu1Var).currentAccount;
            kl8 kl8Var = new kl8(zu1Var, i, zu1Var.h(), new pw4(tL_premiumGiftOption), null, zu1Var.Ba);
            kl8Var.E2 = false;
            kl8Var.X1 = dl1Var.getMessageObject().N3();
            zu1Var.showDialog(kl8Var);
            return;
        }
        b(dl1Var);
        l01 l01Var = zu1Var.pc;
        wl8 wl8Var = wl8.N2;
        tv4.a1(LaunchActivity.Q(), str, l01Var);
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final boolean i0(dl1 dl1Var, float f, float f2) {
        boolean z;
        zu1 zu1Var = this.a.R;
        z = ((e) zu1Var).inPreviewMode;
        if (z) {
            return false;
        }
        return zu1Var.Y5(dl1Var, false, false, f, f2, true, true, false);
    }

    @Override
    public final void j(dl1 dl1Var) {
        zq1 zq1Var;
        zu1 zu1Var = this.a.R;
        r47 messageObject = dl1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.M1 = true;
        wq1 wq1Var = zu1Var.A0;
        if (wq1Var != null && (zq1Var = zu1Var.C0) != null && zq1Var.y < 0) {
            int childCount = wq1Var.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = zu1Var.A0.getChildAt(childCount);
                zu1Var.A0.getClass();
                if (RecyclerView.S(childAt) >= 0) {
                    if (childAt instanceof wb2) {
                        if (((wb2) childAt).getCurrentMessagesGroup() == null) {
                            zu1Var.i7(childAt);
                            break;
                        }
                    } else if (childAt instanceof dl1) {
                        zu1Var.i7(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        zu1Var.Zc(messageObject, false);
    }

    @Override
    public final void k(dl1 dl1Var, String str) {
        b(dl1Var);
        zu1 zu1Var = this.a.R;
        tv4.a1(zu1Var, str, zu1Var.pc);
    }

    @Override
    public final void n(dl1 dl1Var, int i, int i2) {
        aq1 aq1Var = new aq1(this, dl1Var, i, i2, (byte) 1);
        zu1 zu1Var = this.a.R;
        if (zu1Var.D0.O) {
            zu1Var.Kb(false, true, true);
            hl.d3(aq1Var, 80L);
            return;
        }
        aq1Var.run();
    }

    @Override
    public final void o(dl1 dl1Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        boolean z;
        int i;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaper wallPaper;
        String str;
        r47 messageObject = dl1Var.getMessageObject();
        PhotoViewer q0 = PhotoViewer.q0();
        zu1 zu1Var = this.a.R;
        q0.T1(null, zu1Var, zu1Var.Ba);
        boolean z2 = false;
        TLRPC.PhotoSize w = xb4.w(messageObject.p0, 640, false, null, false);
        if (dl1Var.getMessageObject().D == 24) {
            lcb orCreateStoryViewer = zu1Var.getOrCreateStoryViewer();
            wq1 wq1Var = zu1Var.A0;
            orCreateStoryViewer.getClass();
            r47 messageObject2 = dl1Var.getMessageObject();
            if (zu1Var.getParentActivity() != null && messageObject2.D == 24) {
                TLRPC.MessageMedia messageMedia = messageObject2.k.media;
                TL_stories.StoryItem storyItem = messageMedia.storyItem;
                storyItem.dialogId = wf3.n(messageMedia.peer);
                storyItem.messageId = messageObject2.e1();
                orCreateStoryViewer.J(zu1Var.getParentActivity(), messageObject2.k.media.storyItem, l6b.a(wq1Var));
            }
        } else if (dl1Var.getMessageObject().D == 22) {
            i = ((e) zu1Var).currentAccount;
            uc7 s1 = uc7.s1(i);
            RadialProgress2 radialProgress2 = dl1Var.K1;
            if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.e1() < 0 && (str = s1.J2) != null && TextUtils.equals(messageObject.k.action.wallpaper.uploadingImage, str)) {
                unb unbVar = s1.K2;
                if (unbVar != null) {
                    if (unbVar.s != null) {
                        for (int i2 = 0; i2 < s1.K2.s.size(); i2++) {
                            ConnectionsManager.getInstance(s1.currentAccount).cancelRequest(((Integer) s1.K2.s.get(i2)).intValue(), true);
                        }
                    }
                    xb4.G(s1.currentAccount).b(s1.J2, false);
                    long j = s1.K2.n;
                    int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                    if (i3 != 0) {
                        if (i3 >= 0) {
                            TLRPC.UserFull Y1 = s1.Y1(j);
                            if (Y1 != null) {
                                Y1.wallpaper = s1.K2.t;
                                jn7.f(s1.currentAccount).k(68, Long.valueOf(s1.K2.n), Y1);
                            }
                        } else {
                            TLRPC.ChatFull N0 = s1.N0(-j);
                            if (N0 != null) {
                                N0.wallpaper = s1.K2.t;
                                jn7 f = jn7.f(s1.currentAccount);
                                Boolean bool = Boolean.FALSE;
                                f.k(31, N0, 0, bool, bool);
                            }
                        }
                    }
                    s1.K2 = null;
                    s1.J2 = null;
                }
                zu1Var.bb(messageObject);
                return;
            }
            r47 r47Var = dl1Var.Q0;
            if (r47Var != null && dl1Var.W(r47Var) && dl1Var.y1 != null) {
                TLRPC.MessageAction messageAction = messageObject.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                    TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
                    if (!wallPaper2.pattern && wallPaper2.document != null) {
                        wallPaper = wallPaper2;
                    } else {
                        String str2 = wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
                        yvc yvcVar = new yvc(str2, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, hl.q1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, wallPaper2.settings.motion);
                        wallPaper = yvcVar;
                        if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                            yvcVar.g = (TLRPC.TL_wallPaper) wallPaper2;
                            wallPaper = yvcVar;
                        }
                    }
                    boolean o = aob.I.o();
                    zpb zpbVar = new zpb(wallPaper, zu1Var, o);
                    TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper2.settings;
                    if (wallPaperSettings3 != null) {
                        boolean z3 = wallPaperSettings3.blur;
                        boolean z4 = wallPaperSettings3.motion;
                        zpbVar.H1 = z3;
                        zpbVar.G1 = z4;
                        zpbVar.p1 = wallPaperSettings3.intensity / 100.0f;
                    }
                    zpbVar.s0 = messageObject;
                    zpbVar.h1(r47.B0(messageObject.k));
                    zpbVar.a.a = zu1Var.Ba;
                    zpbVar.r1 = new aqb(zu1Var, o);
                    zu1Var.presentFragment(zpbVar);
                    return;
                }
                return;
            }
            zu1Var.Zb();
        } else {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.k.action.photo.video_sizes;
            if (arrayList != null && !arrayList.isEmpty()) {
                videoSize = xb4.x(1000, messageObject.k.action.photo.video_sizes);
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
            if (dl1Var.getMessageObject().D == 21 && !messageObject.O3()) {
                if (!messageObject.q) {
                    if (videoSize2 != null) {
                        zn5 zn5Var = new zn5(0, true, true);
                        zn5Var.a = zu1Var;
                        zn5Var.d();
                        zn5Var.c.d2.t0(null, videoSize2, 0L);
                        zn5Var.b = new jn1(zu1Var, new TLRPC.FileLocation[1], new TLRPC.FileLocation[1], zu1Var.getUserConfig().e(), (byte) 5);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    jn5.j(videoSize, messageObject.k.action.photo);
                    xb4 fileLoader = zu1Var.getFileLoader();
                    if (videoSize == null) {
                        TLRPC.Photo photo = messageObject.k.action.photo;
                        fileLoader.getClass();
                        I = xb4.I(photo);
                    } else {
                        fileLoader.getClass();
                        I = xb4.I(videoSize);
                    }
                    File file = new File(xb4.z(4), I.getName());
                    if (!I.exists()) {
                        if (file.exists()) {
                            I = file;
                        } else {
                            return;
                        }
                    }
                    no6 no6Var = new no6(0, I.getAbsolutePath(), 0, false, 0, 0);
                    no6Var.a = zu1Var.a0.getFieldText();
                    if (videoSize != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    no6Var.b = z;
                    arrayList3.add(no6Var);
                    PhotoViewer.q0().o1(arrayList3, 0, 1, false, new ct1(this, messageObject, no6Var), null);
                    if (no6Var.b) {
                        PhotoViewer.q0().X1(ob6.M0(2131744025, null));
                    } else {
                        PhotoViewer.q0().X1(ob6.M0(2131744028, null));
                    }
                    xn5 xn5Var = new xn5(1, zu1Var.getUserConfig().f());
                    if (videoSize != null) {
                        z2 = true;
                    }
                    xn5Var.e = z2;
                    xn5Var.b = zu1Var.getMessagesController().X1(Long.valueOf(zu1Var.l6));
                    PhotoViewer.q0().G1(xn5Var);
                }
            } else if (videoSize != null) {
                PhotoViewer.q0().k1(videoSize.location, jn5.j(videoSize, messageObject.k.action.photo), zu1Var.db);
                if (dl1Var.getMessageObject().D == 21) {
                    PhotoViewer.q0().X1(ob6.M0(2131744025, null));
                }
            } else if (w != null) {
                PhotoViewer.q0().k1(w.location, jn5.i(w, messageObject.k.action.photo), zu1Var.db);
                if (dl1Var.getMessageObject().D == 21) {
                    PhotoViewer.q0().X1(ob6.M0(2131744028, null));
                }
            } else {
                PhotoViewer.q0().l1(messageObject, null, 0L, 0L, 0L, zu1Var.db);
            }
        }
    }

    @Override
    public final void q(dl1 dl1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        int intValue;
        yr1 yr1Var = this.a.R.Ua;
        FrameLayout frameLayout = yr1Var.H;
        HashMap hashMap = yr1Var.f;
        Random random = yr1Var.h;
        ArrayList arrayList = yr1Var.G;
        if (arrayList.size() <= 12 && dl1Var.getPhotoImage().E()) {
            float f = dl1Var.getPhotoImage().O0;
            float f2 = dl1Var.getPhotoImage().N0;
            if (f > 0.0f && f2 > 0.0f) {
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (((sv3) arrayList.get(i3)).p == dl1Var.getMessageObject().e1()) {
                        i++;
                        if (((sv3) arrayList.get(i3)).r.y() == null || ((sv3) arrayList.get(i3)).r.y().t()) {
                            return;
                        }
                    }
                    if (((sv3) arrayList.get(i3)).q != null && document != null && ((sv3) arrayList.get(i3)).q.id == document.id) {
                        i2++;
                    }
                }
                if (i < 4) {
                    sv3 sv3Var = new sv3();
                    sv3Var.h = true;
                    if (!sv3Var.i) {
                        sv3Var.f = ((random.nextInt() % 101) / 100.0f) * (f2 / 4.0f);
                        sv3Var.g = ((random.nextInt() % 101) / 100.0f) * (f / 4.0f);
                    }
                    sv3Var.p = dl1Var.getMessageObject().e1();
                    sv3Var.m = true;
                    ImageReceiver imageReceiver = sv3Var.r;
                    imageReceiver.u0 = true;
                    int f3 = tv3.f();
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
                        imageReceiver.w1 = uh9.l(sb, sv3Var.p, "_");
                    }
                    sv3Var.q = document;
                    sv3Var.r.d0(jn5.d(videoSize, document), qd4.m(f3, f3, "_"), null, "tgs", yr1Var.c, 1);
                    imageReceiver.m0(Integer.MAX_VALUE);
                    imageReceiver.M(0);
                    if (imageReceiver.y() != null) {
                        if (sv3Var.h) {
                            imageReceiver.y().I(0, false, true);
                        }
                        imageReceiver.y().start();
                    }
                    arrayList.add(sv3Var);
                    if (yr1Var.n) {
                        imageReceiver.I();
                        imageReceiver.p0(frameLayout);
                    }
                    frameLayout.invalidate();
                }
            }
        }
    }

    @Override
    public final e w() {
        return this.a.R;
    }

    @Override
    public final void y(dl1 dl1Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        this.a.R.o6(dl1Var, reactionCount, z, f, f2);
    }

    @Override
    public final void x(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
