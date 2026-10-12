package bi;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ac0;
import org.telegram.ui.ah0;
import org.telegram.ui.bh0;
import org.telegram.ui.bv0;
import org.telegram.ui.fo;
import org.telegram.ui.hr0;
import org.telegram.ui.ic1;
import org.telegram.ui.kv0;
import org.telegram.ui.lr0;
import org.telegram.ui.mr0;
import org.telegram.ui.ot0;
import org.telegram.ui.pu0;
public final class z2 implements View.OnClickListener {
    public final int f4056a;
    public final boolean f4057b;
    public final Object f4058c;

    public z2(int i10, Object obj, boolean z10) {
        this.f4056a = i10;
        this.f4058c = obj;
        this.f4057b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        of ofVar;
        boolean z11;
        View view2;
        switch (this.f4056a) {
            case 0:
                q5 q5Var = (q5) this.f4058c;
                boolean z12 = this.f4057b;
                MessagesController.getInstance(q5Var.C2).setStoryQuality(!z12);
                zc zcVar = new zc(q5Var.f3511c1, q5Var.B0);
                int i12 = R.raw.chats_infotip;
                if (!z12) {
                    i10 = R.string.StoryQualityIncreasedTitle;
                } else {
                    i10 = R.string.StoryQualityDecreasedTitle;
                }
                String string = LocaleController.getString(i10);
                if (!z12) {
                    i11 = R.string.StoryQualityIncreasedMessage;
                } else {
                    i11 = R.string.StoryQualityDecreasedMessage;
                }
                zcVar.M(string, LocaleController.getString(i11), i12).j();
                h5 h5Var = q5Var.f3563t1;
                if (h5Var != null) {
                    h5Var.a();
                    return;
                }
                return;
            case 1:
                h5 h5Var2 = (h5) this.f4058c;
                boolean z13 = this.f4057b;
                t1 t1Var = t1.W;
                if (t1Var != null) {
                    boolean z14 = !z13;
                    if (t1Var.f3724n && t1Var.f3725r != z14) {
                        t1Var.f3725r = z14;
                        NativeInstance nativeInstance = t1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                h5 h5Var3 = h5Var2.f3122l.f3563t1;
                if (h5Var3 != null) {
                    h5Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f4058c;
                boolean z15 = this.f4057b;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
                if (m1Var != null && m1Var.isShowing() && z15) {
                    if (!u0Var.T) {
                        u0Var.T = true;
                        u0Var.d.d(u0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var.f20677c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = u0Var.P;
                if (q0Var != null) {
                    q0Var.l(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                ic1 ic1Var = (ic1) this.f4058c;
                boolean z16 = this.f4057b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.z0 z0Var = ((org.telegram.ui.Cells.z0[]) ic1Var.f37096b)[i13];
                    org.telegram.ui.Cells.y0 y0Var = z0Var.f22796a;
                    if (z0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    y0Var.a(z10, true);
                }
                SharedConfig.setUseThreeLinesLayout(z16);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4058c;
                boolean z17 = this.f4057b;
                td tdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z17 && (ofVar = chatActivityEnterView.L0) != null) {
                    ofVar.h(!Q0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !Q0;
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                AndroidUtilities.runOnUIThread(tdVar, 500L);
                return;
            case 5:
                vi viVar = (vi) this.f4058c;
                boolean z18 = this.f4057b;
                org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
                if (viVar.T0 != 0) {
                    viVar.f29993c2.z();
                    viVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                mr0 mr0Var = new mr0(hashMap, arrayList, 0, true, (fo) m2Var);
                uh uhVar = new uh(viVar, hashMap, arrayList);
                hr0 hr0Var = mr0Var.f38318a;
                hr0Var.f36937s0 = uhVar;
                hr0 hr0Var2 = mr0Var.f38319b;
                hr0Var2.f36937s0 = uhVar;
                hr0Var.f36938t0 = new lr0(mr0Var, 0);
                hr0Var2.f36938t0 = new lr0(mr0Var, 1);
                int i14 = viVar.V1;
                boolean z19 = viVar.W1;
                hr0Var.f0(i14, z19);
                mr0Var.f38319b.f0(i14, z19);
                if (z18) {
                    m2Var.showAsSheet(mr0Var);
                } else {
                    m2Var.presentFragment(mr0Var);
                }
                viVar.dismiss();
                return;
            case 6:
                fh0 fh0Var = (fh0) this.f4058c;
                boolean z20 = this.f4057b;
                fh0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new zu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                hv hvVar = fh0Var.U;
                if (hvVar != null) {
                    hvVar.I();
                    return;
                }
                PhotoViewer photoViewer = fh0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f32186a9 != null) {
                        PhotoViewer.f32186a9.G0(false, true);
                    }
                    pu0 pu0Var = photoViewer.f32235f0;
                    if (pu0Var != null && pu0Var.f28594f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                pu0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        pu0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) pu0Var.f28594f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(pu0Var.f28594f);
                        }
                        pu0Var.addView(pu0Var.f28594f, 0, w7.a6.e(-1, -1, 51));
                        fh0.j(false);
                    }
                    PhotoViewer.f32186a9 = PhotoViewer.f32187b9;
                    PhotoViewer.f32187b9 = null;
                    if (photoViewer.f32235f0 == null) {
                        photoViewer.L3 = true;
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                        photoViewer.F3 = true;
                    }
                    photoViewer.J3 = false;
                    if (photoViewer.D2) {
                        view2 = photoViewer.C2;
                    } else {
                        view2 = photoViewer.B2;
                    }
                    View view3 = view2;
                    if (photoViewer.f32235f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f32408y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f32405y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f32235f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            il0 o10 = fh0.o(photoViewer.f32408y2.getAspectRatio(), false);
                            float f7 = o10.f25992c / photoViewer.f32399x3.getLayoutParams().width;
                            photoViewer.f32399x3.setScaleX(f7);
                            photoViewer.f32399x3.setScaleY(f7);
                            photoViewer.f32399x3.setTranslationX(o10.f25990a);
                            photoViewer.f32399x3.setTranslationY(o10.f25991b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o10.f25990a - photoViewer.f32408y2.getX());
                            view3.setTranslationY(o10.f25991b - photoViewer.f32408y2.getY());
                            bv0 bv0Var = photoViewer.E2;
                            if (bv0Var != null) {
                                bv0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            ot0 ot0Var = new ot0(photoViewer, f7, 1);
                            view3.setOutlineProvider(ot0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f32399x3.setOutlineProvider(ot0Var);
                            photoViewer.f32399x3.setClipToOutline(true);
                            bv0 bv0Var2 = photoViewer.E2;
                            if (bv0Var2 != null) {
                                bv0Var2.setOutlineProvider(ot0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            fh0.j(true);
                        }
                    } else {
                        photoViewer.f32300m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f32234f = true;
                        ((WindowManager) photoViewer.f32405y.getSystemService("window")).addView(photoViewer.f32243g0, photoViewer.f32217d0);
                        Activity activity = photoViewer.f32405y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f32104a1.add(photoViewer.f32350s1);
                        }
                        kv0 kv0Var = photoViewer.f32222d5;
                        if (kv0Var != null && !kv0Var.f37766s) {
                            kv0Var.f37751a.setVisible(false, false);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (photoViewer.D2) {
                        i2.h0 h0Var = photoViewer.F2.d;
                        if (h0Var != null) {
                            h0Var.z1(null);
                        }
                        photoViewer.F2.U(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f32226e0.invalidate();
                        photoViewer.f32379v3 = 4;
                        return;
                    }
                    photoViewer.f32379v3 = 4;
                    return;
                }
                return;
            case 7:
                ac0 ac0Var = (ac0) this.f4058c;
                if (!this.f4057b) {
                    org.telegram.ui.Cells.w8 w8Var = ac0Var.f34169n;
                    if (w8Var != null && w8Var.e.h) {
                        int i15 = -ac0Var.N;
                        ac0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(w8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    boolean z21 = w8Var2.e.h;
                    w8Var2.setChecked(!z21);
                    ac0Var.Z(z21);
                    org.telegram.ui.Cells.w8 w8Var3 = ac0Var.f34169n;
                    if (w8Var3 != null) {
                        if (w8Var2.e.h) {
                            w8Var3.setChecked(false);
                            ac0Var.f34169n.setCheckBoxIcon(R.drawable.permission_locked);
                            ac0Var.f34170r.setVisibility(8);
                            return;
                        } else if (ac0Var.e == null) {
                            w8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                ah0 ah0Var = (ah0) this.f4058c;
                boolean z22 = this.f4057b;
                bh0 bh0Var = ah0Var.V;
                if (bh0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !bh0Var.E;
                    bh0Var.E = z24;
                    ((org.telegram.ui.Cells.a2) view).c(z24, true);
                    if (((z22 && bh0Var.getConnectionsManager().isTestBackend()) ? false : false) != bh0Var.E) {
                        bh0Var.getConnectionsManager().switchBackend(false);
                    }
                    ah0Var.r();
                    return;
                }
                return;
        }
    }
}
