package defpackage;

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class mi3 implements vl5 {
    public final cj3 a;

    public mi3(cj3 cj3Var) {
        this.a = cj3Var;
    }

    @Override
    public final void H(float f) {
        m21 m21Var = this.a.i4;
        if (m21Var != null) {
            ((d21) m21Var.e).setProgress(f * 0.9f);
        }
    }

    @Override
    public final void O(boolean z, boolean z2) {
        wjb wjbVar;
        wjb wjbVar2;
        int i;
        cj3 cj3Var = this.a;
        m21 m21Var = cj3Var.i4;
        if (m21Var != null) {
            m21Var.b();
            cj3Var.i4 = null;
        }
        Activity parentActivity = cj3Var.getParentActivity();
        wjbVar = ((d) cj3Var).resourceProvider;
        ?? h11Var = new h11(parentActivity, wjbVar);
        c21 c21Var = new c21(h11Var, parentActivity);
        h11Var.b = c21Var;
        c21Var.setWillNotDraw(false);
        h11Var.addView(c21Var, nme.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        be0 be0Var = new be0(parentActivity);
        h11Var.c = be0Var;
        be0Var.setRoundRadius(gl.L(14.0f));
        c21Var.addView(be0Var, nme.e(28, 28, 17));
        hn hnVar = new hn(parentActivity, false, false, false);
        h11Var.d = hnVar;
        hnVar.setTypeface(Typeface.SANS_SERIF);
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        h11Var.addView(hnVar, nme.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        h11Var.setTextColor(h11Var.getThemedColor(bkb.xj));
        h11Var.setBackground(h11Var.getThemedColor(bkb.vj));
        if (z) {
            be0Var.setImageBitmap(cj3Var.f4.r);
        } else {
            be0Var.setImageBitmap(PhotoViewer.r0().B4.n());
        }
        Activity parentActivity2 = cj3Var.getParentActivity();
        wjbVar2 = ((d) cj3Var).resourceProvider;
        k21 k21Var = new k21(wjbVar2, parentActivity2, true);
        k21Var.e(k96.M0(2131743321, null));
        k21Var.b = new li3(this, (byte) 0);
        h11Var.setButton(k21Var);
        h11Var.getButton().setVisibility(8);
        if (z2) {
            i = 2131742529;
        } else {
            i = 2131742531;
        }
        hnVar.c(k96.M0(i, null), true, true);
        m21 b = u21.b0(cj3Var).b(h11Var, -1);
        cj3Var.i4 = b;
        b.r = false;
        b.i(false);
        m21 m21Var2 = cj3Var.i4;
        m21Var2.s = true;
        m21Var2.j();
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z, final TLRPC.VideoSize videoSize) {
        gl.c3(new Runnable() {
            @Override
            public final void run() {
                a aVar;
                mi3 mi3Var = mi3.this;
                cj3 cj3Var = mi3Var.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    cj3Var.g4 = photoSize2.location;
                    cj3Var.h4 = photoSize.location;
                } else if (cj3Var.g4 == null) {
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
                    cj3Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new mi1(mi3Var, str, z, (byte) 2));
                }
                aVar = ((d) cj3Var).actionBar;
                aVar.t().requestLayout();
            }
        });
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final p98 getCloseIntoObject() {
        cj3 cj3Var = this.a;
        m21 m21Var = cj3Var.i4;
        if (m21Var != null) {
            d21 d21Var = (d21) m21Var.e;
            p98 p98Var = new p98();
            int[] iArr = new int[2];
            be0 be0Var = d21Var.c;
            be0 be0Var2 = d21Var.c;
            be0Var.getLocationInWindow(iArr);
            p98Var.b = iArr[0];
            p98Var.c = iArr[1];
            p98Var.d = cj3Var.fragmentView;
            ImageReceiver imageReceiver = be0Var2.getImageReceiver();
            p98Var.a = imageReceiver;
            p98Var.e = imageReceiver.p();
            p98Var.i = 0;
            p98Var.h = p98Var.a.X0;
            p98Var.k = be0Var2.getScaleX();
            return p98Var;
        }
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final boolean x() {
        return true;
    }

    @Override
    public final void T() {
    }
}
