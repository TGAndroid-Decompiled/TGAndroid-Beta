package ai;

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
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cr0;
import org.telegram.ui.dc1;
import org.telegram.ui.dv0;
import org.telegram.ui.gr0;
import org.telegram.ui.hr0;
import org.telegram.ui.ht0;
import org.telegram.ui.iu0;
import org.telegram.ui.uu0;
import org.telegram.ui.xg0;
import org.telegram.ui.yg0;
import org.telegram.ui.zb0;
import org.telegram.ui.zn;
public final class j3 implements View.OnClickListener {
    public final int f1036a;
    public final boolean f1037b;
    public final Object f1038c;

    public j3(int i10, Object obj, boolean z10) {
        this.f1036a = i10;
        this.f1038c = obj;
        this.f1037b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        mf mfVar;
        boolean z11;
        View view2;
        switch (this.f1036a) {
            case 0:
                f6 f6Var = (f6) this.f1038c;
                boolean z12 = this.f1037b;
                MessagesController.getInstance(f6Var.C2).setStoryQuality(!z12);
                xc xcVar = new xc(f6Var.f800c1, f6Var.B0);
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
                xcVar.M(string, LocaleController.getString(i11), i12).j();
                w5 w5Var = f6Var.f851t1;
                if (w5Var != null) {
                    w5Var.a();
                    return;
                }
                return;
            case 1:
                w5 w5Var2 = (w5) this.f1038c;
                boolean z13 = this.f1037b;
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean z14 = !z13;
                    if (d2Var.f689n && d2Var.f690r != z14) {
                        d2Var.f690r = z14;
                        NativeInstance nativeInstance = d2Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                w5 w5Var3 = w5Var2.f1655l.f851t1;
                if (w5Var3 != null) {
                    w5Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f1038c;
                boolean z15 = this.f1037b;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
                if (n1Var != null && n1Var.isShowing() && z15) {
                    if (!v0Var.T) {
                        v0Var.T = true;
                        v0Var.d.d(v0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var.f19814c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.r0 r0Var = v0Var.P;
                if (r0Var != null) {
                    r0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                dc1 dc1Var = (dc1) this.f1038c;
                boolean z16 = this.f1037b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) dc1Var.f33034b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f21888a;
                    if (y0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x0Var.a(z10, true);
                }
                SharedConfig.setUseThreeLinesLayout(z16);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1038c;
                boolean z17 = this.f1037b;
                sd sdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z17 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !S0;
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                AndroidUtilities.runOnUIThread(sdVar, 500L);
                return;
            case 5:
                vi viVar = (vi) this.f1038c;
                boolean z18 = this.f1037b;
                org.telegram.ui.ActionBar.n2 n2Var = viVar.f29096f0;
                if (viVar.Q0 != 0) {
                    viVar.Z1.v0();
                    viVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                hr0 hr0Var = new hr0(hashMap, arrayList, 0, true, (zn) n2Var);
                uh uhVar = new uh(viVar, hashMap, arrayList);
                cr0 cr0Var = hr0Var.f34283a;
                cr0Var.f32877s0 = uhVar;
                cr0 cr0Var2 = hr0Var.f34284b;
                cr0Var2.f32877s0 = uhVar;
                cr0Var.f32878t0 = new gr0(hr0Var, 0);
                cr0Var2.f32878t0 = new gr0(hr0Var, 1);
                int i14 = viVar.S1;
                boolean z19 = viVar.T1;
                cr0Var.f0(i14, z19);
                hr0Var.f34284b.f0(i14, z19);
                if (z18) {
                    n2Var.showAsSheet(hr0Var);
                } else {
                    n2Var.presentFragment(hr0Var);
                }
                viVar.dismiss();
                return;
            case 6:
                rg0 rg0Var = (rg0) this.f1038c;
                boolean z20 = this.f1037b;
                rg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new nu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                vu vuVar = rg0Var.U;
                if (vuVar != null) {
                    vuVar.I();
                    return;
                }
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f31202a9 != null) {
                        PhotoViewer.f31202a9.G0(false, true);
                    }
                    iu0 iu0Var = photoViewer.f31251f0;
                    if (iu0Var != null && iu0Var.f22986f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                iu0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        iu0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) iu0Var.f22986f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(iu0Var.f22986f);
                        }
                        iu0Var.addView(iu0Var.f22986f, 0, w7.y5.e(-1, -1, 51));
                        rg0.j(false);
                    }
                    PhotoViewer.f31202a9 = PhotoViewer.f31203b9;
                    PhotoViewer.f31203b9 = null;
                    if (photoViewer.f31251f0 == null) {
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
                    if (photoViewer.f31251f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f31423y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f31420y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f31251f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            uk0 o9 = rg0.o(photoViewer.f31423y2.getAspectRatio(), false);
                            float f7 = o9.f28796c / photoViewer.f31414x3.getLayoutParams().width;
                            photoViewer.f31414x3.setScaleX(f7);
                            photoViewer.f31414x3.setScaleY(f7);
                            photoViewer.f31414x3.setTranslationX(o9.f28794a);
                            photoViewer.f31414x3.setTranslationY(o9.f28795b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f28794a - photoViewer.f31423y2.getX());
                            view3.setTranslationY(o9.f28795b - photoViewer.f31423y2.getY());
                            uu0 uu0Var = photoViewer.E2;
                            if (uu0Var != null) {
                                uu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            ht0 ht0Var = new ht0(photoViewer, f7, 1);
                            view3.setOutlineProvider(ht0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f31414x3.setOutlineProvider(ht0Var);
                            photoViewer.f31414x3.setClipToOutline(true);
                            uu0 uu0Var2 = photoViewer.E2;
                            if (uu0Var2 != null) {
                                uu0Var2.setOutlineProvider(ht0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            rg0.j(true);
                        }
                    } else {
                        photoViewer.f31315m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f31250f = true;
                        ((WindowManager) photoViewer.f31420y.getSystemService("window")).addView(photoViewer.f31259g0, photoViewer.f31233d0);
                        Activity activity = photoViewer.f31420y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f31120a1.add(photoViewer.f31365s1);
                        }
                        dv0 dv0Var = photoViewer.f31238d5;
                        if (dv0Var != null && !dv0Var.f33178s) {
                            dv0Var.f33163a.setVisible(false, false);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (photoViewer.D2) {
                        i2.e0 e0Var = photoViewer.F2.d;
                        if (e0Var != null) {
                            e0Var.v1(null);
                        }
                        photoViewer.F2.U(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f31242e0.invalidate();
                        photoViewer.f31394v3 = 4;
                        return;
                    }
                    photoViewer.f31394v3 = 4;
                    return;
                }
                return;
            case 7:
                zb0 zb0Var = (zb0) this.f1038c;
                if (!this.f1037b) {
                    org.telegram.ui.Cells.x8 x8Var = zb0Var.f40183n;
                    if (x8Var != null && x8Var.e.h) {
                        int i15 = -zb0Var.N;
                        zb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(x8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
                    boolean z21 = x8Var2.e.h;
                    x8Var2.setChecked(!z21);
                    zb0Var.Z(z21);
                    org.telegram.ui.Cells.x8 x8Var3 = zb0Var.f40183n;
                    if (x8Var3 != null) {
                        if (x8Var2.e.h) {
                            x8Var3.setChecked(false);
                            zb0Var.f40183n.setCheckBoxIcon(R.drawable.permission_locked);
                            zb0Var.f40184r.setVisibility(8);
                            return;
                        } else if (zb0Var.e == null) {
                            x8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                xg0 xg0Var = (xg0) this.f1038c;
                boolean z22 = this.f1037b;
                yg0 yg0Var = xg0Var.V;
                if (yg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !yg0Var.E;
                    yg0Var.E = z24;
                    ((org.telegram.ui.Cells.a2) view).c(z24, true);
                    if (((z22 && yg0Var.getConnectionsManager().isTestBackend()) ? false : false) != yg0Var.E) {
                        yg0Var.getConnectionsManager().switchBackend(false);
                    }
                    xg0Var.s();
                    return;
                }
                return;
        }
    }
}
