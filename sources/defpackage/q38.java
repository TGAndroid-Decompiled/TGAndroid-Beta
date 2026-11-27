package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.view.View;
import android.widget.FrameLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.webrtc.VideoSource;
public final class q38 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;

    public q38(l09 l09Var, IOException iOException, boolean z) {
        this.a = (byte) 20;
        this.c = l09Var;
        this.b = z;
    }

    @Override
    public final void run() {
        int i;
        String str;
        float f;
        String str2;
        int i2;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        byte b = this.a;
        int i3 = 8;
        int i4 = 0;
        boolean z = false;
        boolean z2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((s38) obj).e.q0.J.F(1 - (z2 ? 1 : 0));
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (!z2) {
                    photoViewer.W0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).Z3(z2, true);
                return;
            case 3:
                FrameLayout frameLayout = (FrameLayout) obj;
                if (z2) {
                    i4 = 4;
                }
                frameLayout.setVisibility(i4);
                return;
            case 4:
                Activity parentActivity = ((wr8) obj).e.getParentActivity();
                if (z2) {
                    i = 2131746431;
                } else {
                    i = 2131746433;
                }
                m01.u(parentActivity, ob6.M0(i, null));
                return;
            case 5:
                dk9 dk9Var = (dk9) obj;
                hl9 hl9Var = dk9Var.a;
                boolean z3 = !z2 ? 1 : 0;
                TLObject tLObject = dk9Var.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z3;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z3;
                }
                View view = hl9Var.Q;
                if (view != null) {
                    dk9Var.r.a = view;
                }
                dk9Var.r.f(-1, z3, true);
                View view2 = hl9Var.Q;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 6:
                nm9 nm9Var = (nm9) obj;
                if (z2) {
                    str = "shown after a change away";
                } else {
                    str = "shown, height differs";
                }
                nm9Var.p0(str, false);
                return;
            case 7:
                on9 on9Var = (on9) obj;
                on9Var.O = z2;
                on9Var.P = on9Var.E();
                on9Var.Q = 0;
                on9Var.R = 0;
                on9Var.j.b("torch requested: enabled=" + z2 + ", available=" + on9Var.E() + ", cameraId=" + on9Var.o + ", facing=" + on9Var.F);
                on9Var.a();
                return;
            case 8:
                dr9 dr9Var = (dr9) obj;
                er9 er9Var = dr9Var.P;
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                er9Var.X = f;
                dr9Var.L = true;
                dr9Var.requestLayout();
                return;
            case 9:
                xz0 xz0Var = ((rr9) obj).e;
                boolean z4 = !z2 ? 1 : 0;
                xz0Var.getClass();
                if (z4) {
                    z = true;
                }
                xz0Var.y = z;
                return;
            case 10:
                e eVar = ((aw9) obj).H;
                if (z2) {
                    str2 = "upload_speed";
                } else {
                    str2 = "download_speed";
                }
                eVar.presentFragment(new PremiumPreviewFragment(0, str2));
                return;
            case 11:
                i2a i2aVar = (i2a) obj;
                if (!z2) {
                    i2aVar.setVisibility(8);
                    return;
                }
                return;
            case 12:
                eja ejaVar = (eja) obj;
                if (!z2) {
                    ejaVar.p0.setVisibility(8);
                    return;
                }
                return;
            case 13:
                cga cgaVar = (cga) obj;
                if (!z2) {
                    cgaVar.W.t0.setVisibility(8);
                    return;
                }
                return;
            case 14:
                fga fgaVar = (fga) obj;
                if (!z2) {
                    fgaVar.x.t0.setVisibility(8);
                    return;
                }
                return;
            case 15:
                wma wmaVar = (wma) obj;
                ArrayList arrayList = wmaVar.r;
                vma vmaVar = wmaVar.n;
                if (vmaVar != null) {
                    vmaVar.L(wmaVar.f, z2);
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((vma) arrayList.get(i5)).L(wmaVar.f, z2);
                }
                return;
            case 16:
                xma xmaVar = (xma) obj;
                ArrayList arrayList2 = xmaVar.r;
                vma vmaVar2 = xmaVar.n;
                if (vmaVar2 != null) {
                    vmaVar2.L(xmaVar.i0, z2);
                }
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    ((vma) arrayList2.get(i6)).L(xmaVar.i0, z2);
                }
                return;
            case 17:
                gra graVar = (gra) obj;
                if (!z2) {
                    graVar.l2.setVisibility(8);
                    return;
                }
                return;
            case 18:
                wua wuaVar = (wua) obj;
                if (z2) {
                    i2 = 2131750385;
                } else {
                    i2 = 2131750382;
                }
                wuaVar.v2(wuaVar.h3, hl.S2(ob6.a0(null, null, i2, wuaVar.t1())), true);
                return;
            case 19:
                wua wuaVar2 = ((fta) obj).W;
                TL_stars.SavedStarGift y1 = wuaVar2.y1(z2);
                if (y1 != null) {
                    wuaVar2.Z2 = true;
                    wuaVar2.o2(y1, wuaVar2.B2);
                } else {
                    TL_stars.TL_starGiftUnique z1 = wuaVar2.z1(z2);
                    if (z1 != null) {
                        wuaVar2.Z2 = true;
                        wuaVar2.n2(z1.slug, z1, wuaVar2.B2);
                    }
                }
                wuaVar2.P2 = -1;
                v21 v21Var = v21.x;
                if (v21Var != null) {
                    v21Var.c(0L, false);
                    return;
                }
                return;
            case 20:
                v34 v34Var = (v34) ((ny8) ((l09) obj).b).f;
                v34Var.getClass();
                ug5 ug5Var = (ug5) v34Var.b;
                yve.p(ug5Var.k);
                if (z2 && ug5Var.m == null) {
                    ug5Var.f();
                    return;
                }
                return;
            case 21:
                wab wabVar = (wab) obj;
                if (!z2) {
                    wabVar.o2.k1.setVisibility(8);
                    return;
                }
                return;
            case 22:
                ktb ktbVar = (ktb) obj;
                hl.c3(new ctb(ktbVar, (byte) 1));
                wb2 wb2Var = ktbVar.L;
                if (wb2Var != null) {
                    wb2Var.setVisibility(0);
                    if (!z2) {
                        wb2 wb2Var2 = ktbVar.L;
                        int e2 = wb2Var2.e2(ktbVar.P);
                        itb itbVar = ktbVar.J;
                        CheckBoxBase[] checkBoxBaseArr2 = wb2Var2.f7;
                        if (checkBoxBaseArr2 != null && e2 >= 0 && e2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[e2]) != null && itbVar != null && (checkBoxBaseArr = itbVar.f7) != null && e2 >= 0 && e2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[e2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    wb2 wb2Var3 = ktbVar.L;
                    wb2Var3.c6 = -1;
                    wb2Var3.invalidate();
                }
                st1 st1Var = ktbVar.d0;
                if (st1Var != null) {
                    hl.c3(st1Var);
                    ktbVar.d0 = null;
                    return;
                }
                return;
            case 23:
                ((icc) obj).a(null, Boolean.valueOf(z2));
                return;
            case 24:
                ((l9c) obj).Q(z2);
                return;
            case 25:
                ((VideoCapturerDevice) obj).lambda$new$0(z2);
                return;
            case 26:
                ((VideoSource) obj).lambda$setIsScreencast$1(z2);
                return;
            case 27:
                ((VoIPService) obj).lambda$startGroupCall$30(z2);
                return;
            case 28:
                ((AudioManager) obj).setSpeakerphoneOn(z2);
                return;
            default:
                View view3 = (View) obj;
                if (z2) {
                    i3 = 0;
                }
                view3.setVisibility(i3);
                return;
        }
    }

    public q38(s38 s38Var, int i) {
        this.a = (byte) 0;
        this.c = s38Var;
        this.b = i;
    }

    public q38(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }
}
