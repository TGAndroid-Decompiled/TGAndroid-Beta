package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class wj3 implements vn5 {
    public final nk3 a;

    public wj3(nk3 nk3Var) {
        this.a = nk3Var;
    }

    @Override
    public final void H(float f) {
        u31 u31Var = this.a.k4;
        if (u31Var != null) {
            ((l31) u31Var.e).setProgress(f * 0.9f);
        }
    }

    @Override
    public final void O(boolean z, boolean z2) {
        ylb ylbVar;
        ylb ylbVar2;
        int i;
        nk3 nk3Var = this.a;
        u31 u31Var = nk3Var.k4;
        if (u31Var != null) {
            u31Var.b();
            nk3Var.k4 = null;
        }
        Activity parentActivity = nk3Var.getParentActivity();
        ylbVar = ((d) nk3Var).resourceProvider;
        ?? p21Var = new p21(parentActivity, ylbVar);
        k31 k31Var = new k31(p21Var, parentActivity);
        p21Var.b = k31Var;
        k31Var.setWillNotDraw(false);
        p21Var.addView(k31Var, qoe.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        bf0 bf0Var = new bf0(parentActivity);
        p21Var.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(14.0f));
        k31Var.addView(bf0Var, qoe.e(28, 28, 17));
        io ioVar = new io(parentActivity, false, false, false);
        p21Var.d = ioVar;
        ioVar.setTypeface(Typeface.SANS_SERIF);
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        p21Var.addView(ioVar, qoe.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        p21Var.setTextColor(p21Var.getThemedColor(cmb.xj));
        p21Var.setBackground(p21Var.getThemedColor(cmb.vj));
        if (z) {
            bf0Var.setImageBitmap(nk3Var.h4.r);
        } else {
            bf0Var.setImageBitmap(PhotoViewer.r0().B4.n());
        }
        Activity parentActivity2 = nk3Var.getParentActivity();
        ylbVar2 = ((d) nk3Var).resourceProvider;
        s31 s31Var = new s31(ylbVar2, parentActivity2, true);
        s31Var.e(jb6.M0(2131743247, null));
        s31Var.b = new bi3(this, (byte) 5);
        p21Var.setButton(s31Var);
        p21Var.getButton().setVisibility(8);
        if (z2) {
            i = 2131742455;
        } else {
            i = 2131742457;
        }
        ioVar.c(jb6.M0(i, null), true, true);
        u31 b = c41.b0(nk3Var).b(p21Var, -1);
        nk3Var.k4 = b;
        b.s = false;
        b.i(false);
        u31 u31Var2 = nk3Var.k4;
        u31Var2.t = true;
        u31Var2.j();
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z, final TLRPC.VideoSize videoSize) {
        gm.c3(new Runnable() {
            @Override
            public final void run() {
                a aVar;
                wj3 wj3Var = wj3.this;
                nk3 nk3Var = wj3Var.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    nk3Var.i4 = photoSize2.location;
                    nk3Var.j4 = photoSize.location;
                } else if (nk3Var.i4 == null) {
                    return;
                } else {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    nk3Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new vj1(wj3Var, str, z, (byte) 2));
                }
                aVar = ((d) nk3Var).actionBar;
                aVar.t().requestLayout();
            }
        });
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final qb8 getCloseIntoObject() {
        nk3 nk3Var = this.a;
        u31 u31Var = nk3Var.k4;
        if (u31Var != null) {
            l31 l31Var = (l31) u31Var.e;
            qb8 qb8Var = new qb8();
            int[] iArr = new int[2];
            bf0 bf0Var = l31Var.c;
            bf0 bf0Var2 = l31Var.c;
            bf0Var.getLocationInWindow(iArr);
            qb8Var.b = iArr[0];
            qb8Var.c = iArr[1];
            qb8Var.d = nk3Var.fragmentView;
            ImageReceiver imageReceiver = bf0Var2.getImageReceiver();
            qb8Var.a = imageReceiver;
            qb8Var.e = imageReceiver.p();
            qb8Var.i = 0;
            qb8Var.h = qb8Var.a.X0;
            qb8Var.k = bf0Var2.getScaleX();
            return qb8Var;
        }
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean w() {
        return true;
    }

    @Override
    public final void T() {
    }
}
