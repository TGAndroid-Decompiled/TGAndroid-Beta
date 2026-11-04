package ei;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.e90;
import org.telegram.ui.fq0;
import org.telegram.ui.mq0;
import org.telegram.ui.s51;
import org.telegram.ui.sm0;
import org.telegram.ui.tm0;
import org.telegram.ui.tp0;
import org.telegram.ui.vm0;
import org.telegram.ui.wm;
import org.telegram.ui.wo0;
public final class e2 implements View.OnClickListener {
    public final int f10217a;
    public final boolean f10218b;
    public final Object f10219c;

    public e2(int i3, Object obj, boolean z10) {
        this.f10217a = i3;
        this.f10219c = obj;
        this.f10218b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i3;
        int i10;
        boolean z10;
        se seVar;
        boolean z11;
        View view2;
        switch (this.f10217a) {
            case 0:
                j4 j4Var = (j4) this.f10219c;
                boolean z12 = this.f10218b;
                boolean z13 = !z12;
                hp s12 = hp.s1(j4Var.f10480m2);
                if (s12.f23092p6 != z13) {
                    SharedPreferences.Editor edit = s12.f22999e7.edit();
                    s12.f23092p6 = z13;
                    edit.putBoolean("storyQualityFull", z13).apply();
                    s12.getNotificationCenter().k(209, new Object[0]);
                }
                fc fcVar = new fc(j4Var.M0, j4Var.f10476l0);
                if (!z12) {
                    i3 = 2131744517;
                } else {
                    i3 = 2131744520;
                }
                String M0 = bd.M0(i3, null);
                if (!z12) {
                    i10 = 2131744518;
                } else {
                    i10 = 2131744521;
                }
                fcVar.I(2131623981, M0, bd.M0(i10, null)).j();
                b4 b4Var = j4Var.f10449d1;
                if (b4Var != null) {
                    b4Var.a();
                    return;
                }
                return;
            case 1:
                b4 b4Var2 = (b4) this.f10219c;
                boolean z14 = this.f10218b;
                g1 g1Var = g1.X;
                if (g1Var != null) {
                    boolean z15 = !z14;
                    if (g1Var.f10301n && g1Var.f10302r != z15) {
                        g1Var.f10302r = z15;
                        NativeInstance nativeInstance = g1Var.F;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z15);
                        }
                    }
                }
                b4 b4Var3 = b4Var2.f10126x.f10449d1;
                if (b4Var3 != null) {
                    b4Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f10219c;
                boolean z16 = this.f10218b;
                if (q0Var.x() && z16) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        q0Var.q();
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.x xVar = q0Var.f28442c;
                if (xVar != null) {
                    xVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.l0 l0Var = q0Var.Q;
                if (l0Var != null) {
                    l0Var.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                s51 s51Var = (s51) this.f10219c;
                boolean z17 = this.f10218b;
                for (int i11 = 0; i11 < 2; i11++) {
                    org.telegram.ui.Cells.v0 v0Var = ((org.telegram.ui.Cells.v0[]) s51Var.f49370b)[i11];
                    org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) v0Var.d;
                    if (v0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u0Var.a(z10, true);
                }
                az.f21654p1 = z17;
                SharedPreferences.Editor edit2 = hp.e1().edit();
                edit2.putBoolean("useThreeLinesLayout", az.f21654p1);
                edit2.apply();
                hs.e().k(3, Boolean.TRUE);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f10219c;
                boolean z18 = this.f10218b;
                yc ycVar = chatActivityEnterView.G4;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean R0 = chatActivityEnterView.R0();
                if (!z18 && (seVar = chatActivityEnterView.M0) != null) {
                    seVar.g(!R0);
                    chatActivityEnterView.M0 = null;
                    return;
                }
                chatActivityEnterView.F4 = !R0;
                org.telegram.messenger.g0.r(ycVar);
                org.telegram.messenger.g0.i3(ycVar, 500L);
                return;
            case 5:
                bi biVar = (bi) this.f10219c;
                boolean z19 = this.f10218b;
                org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                if (biVar.L2 != 0) {
                    biVar.U3.r0();
                    biVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                vm0 vm0Var = new vm0(hashMap, arrayList, 0, true, (wm) d2Var);
                qh qhVar = new qh(biVar, hashMap, arrayList);
                sm0 sm0Var = vm0Var.f50553a;
                sm0Var.f49564t0 = qhVar;
                sm0 sm0Var2 = vm0Var.f50554b;
                sm0Var2.f49564t0 = qhVar;
                sm0Var.f49565u0 = new tm0(vm0Var, 1);
                sm0Var2.f49565u0 = new tm0(vm0Var, 2);
                int i12 = biVar.N3;
                boolean z20 = biVar.O3;
                sm0Var.k0(i12, z20);
                vm0Var.f50554b.k0(i12, z20);
                if (z19) {
                    d2Var.showAsSheet(vm0Var);
                } else {
                    d2Var.presentFragment(vm0Var);
                }
                biVar.dismiss();
                return;
            case 6:
                ie0 ie0Var = (ie0) this.f10219c;
                boolean z21 = this.f10218b;
                ie0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z21 && (!z11 || !LaunchActivity.I1)) {
                    LaunchActivity.J1 = new nt(0, view);
                    Context context = org.telegram.messenger.t0.f25457b;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                ut utVar = ie0Var.V;
                if (utVar != null) {
                    utVar.J0();
                    return;
                }
                PhotoViewer photoViewer = ie0Var.W;
                if (photoViewer != null && photoViewer.K3) {
                    if (PhotoViewer.f41369b9 != null) {
                        PhotoViewer.f41369b9.H0(false, true);
                    }
                    tp0 tp0Var = photoViewer.f41429g0;
                    if (tp0Var != null && tp0Var.f38723f != null) {
                        if (org.telegram.messenger.t0.f25465x) {
                            try {
                                tp0Var.getContext().startService(new Intent(org.telegram.messenger.t0.f25457b, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                org.telegram.messenger.a8.g(th2, true);
                            }
                        }
                        tp0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) tp0Var.f38723f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(tp0Var.f38723f);
                        }
                        tp0Var.addView(tp0Var.f38723f, 0, mf.e(-1, -1, 51));
                        ie0.b(false);
                    }
                    PhotoViewer.f41369b9 = PhotoViewer.f41370c9;
                    PhotoViewer.f41370c9 = null;
                    if (photoViewer.f41429g0 == null) {
                        photoViewer.M3 = true;
                        Bitmap bitmap = photoViewer.D3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.D3 = null;
                        }
                        photoViewer.G3 = true;
                    }
                    photoViewer.K3 = false;
                    if (photoViewer.E2) {
                        view2 = photoViewer.D2;
                    } else {
                        view2 = photoViewer.C2;
                    }
                    View view3 = view2;
                    if (photoViewer.f41429g0 == null && view3 != null) {
                        org.telegram.messenger.g0.E2(view3);
                        view3.setVisibility(4);
                        photoViewer.f41599z2.addView(view3);
                    }
                    if (org.telegram.messenger.t0.f25465x) {
                        try {
                            photoViewer.E.startService(new Intent(org.telegram.messenger.t0.f25457b, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            org.telegram.messenger.a8.g(th3, true);
                        }
                    }
                    if (photoViewer.f41429g0 == null) {
                        if (view3 != null) {
                            photoViewer.C3 = true;
                            ni0 j10 = ie0.j(false, photoViewer.f41599z2.getAspectRatio());
                            float f10 = j10.f36565c / photoViewer.f41591y3.getLayoutParams().width;
                            photoViewer.f41591y3.setScaleX(f10);
                            photoViewer.f41591y3.setScaleY(f10);
                            photoViewer.f41591y3.setTranslationX(j10.f36563a);
                            photoViewer.f41591y3.setTranslationY(j10.f36564b);
                            view3.setScaleX(f10);
                            view3.setScaleY(f10);
                            view3.setTranslationX(j10.f36563a - photoViewer.f41599z2.getX());
                            view3.setTranslationY(j10.f36564b - photoViewer.f41599z2.getY());
                            fq0 fq0Var = photoViewer.F2;
                            if (fq0Var != null) {
                                fq0Var.setScaleX(f10);
                                photoViewer.F2.setScaleY(f10);
                                photoViewer.F2.setTranslationX(view3.getTranslationX());
                                photoViewer.F2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.X = 0.0f;
                            wo0 wo0Var = new wo0(photoViewer, f10, 1);
                            view3.setOutlineProvider(wo0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f41591y3.setOutlineProvider(wo0Var);
                            photoViewer.f41591y3.setClipToOutline(true);
                            fq0 fq0Var2 = photoViewer.F2;
                            if (fq0Var2 != null) {
                                fq0Var2.setOutlineProvider(wo0Var);
                                photoViewer.F2.setClipToOutline(true);
                            }
                        } else {
                            ie0.b(true);
                        }
                    } else {
                        photoViewer.f41492n6 = 0.0f;
                    }
                    try {
                        photoViewer.f41409e = true;
                        photoViewer.f41419f = true;
                        ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.f41437h0, photoViewer.f41410e0);
                        Activity activity = photoViewer.E;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f41288c1.add(photoViewer.f41541t1);
                        }
                        mq0 mq0Var = photoViewer.f41415e5;
                        if (mq0Var != null && !mq0Var.f47767s) {
                            mq0Var.f47751a.O0(false, false);
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                    if (photoViewer.E2) {
                        k2.i0 i0Var = photoViewer.G2.d;
                        if (i0Var != null) {
                            i0Var.z1(null);
                        }
                        photoViewer.G2.z0(photoViewer.D2);
                        photoViewer.D2.setVisibility(4);
                        photoViewer.H3 = 2;
                        photoViewer.G3 = false;
                        photoViewer.f41420f0.invalidate();
                        photoViewer.f41571w3 = 4;
                        return;
                    }
                    photoViewer.f41571w3 = 4;
                    return;
                }
                return;
            default:
                e90 e90Var = (e90) this.f10219c;
                if (!this.f10218b) {
                    org.telegram.ui.Cells.q8 q8Var = e90Var.f44935n;
                    if (q8Var != null && q8Var.f30234e.h) {
                        int i13 = -e90Var.N;
                        e90Var.N = i13;
                        org.telegram.messenger.g0.G3(i13, q8Var, null);
                        return;
                    }
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                    boolean z22 = q8Var2.f30234e.h;
                    q8Var2.setChecked(!z22);
                    e90Var.e0(z22);
                    org.telegram.ui.Cells.q8 q8Var3 = e90Var.f44935n;
                    if (q8Var3 != null) {
                        if (q8Var2.f30234e.h) {
                            q8Var3.setChecked(false);
                            e90Var.f44935n.setCheckBoxIcon(2131232513);
                            e90Var.f44936r.setVisibility(8);
                            return;
                        } else if (e90Var.f44933e == null) {
                            q8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
