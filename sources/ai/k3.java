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
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.gv;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ud;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zh;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dr0;
import org.telegram.ui.eo;
import org.telegram.ui.fc1;
import org.telegram.ui.gv0;
import org.telegram.ui.hr0;
import org.telegram.ui.ir0;
import org.telegram.ui.jt0;
import org.telegram.ui.lu0;
import org.telegram.ui.wb0;
import org.telegram.ui.wg0;
import org.telegram.ui.xg0;
import org.telegram.ui.xu0;
public final class k3 implements View.OnClickListener {
    public final int f1217a;
    public final boolean f1218b;
    public final Object f1219c;

    public k3(int i10, Object obj, boolean z10) {
        this.f1217a = i10;
        this.f1219c = obj;
        this.f1218b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        rf rfVar;
        boolean z11;
        View view2;
        switch (this.f1217a) {
            case 0:
                f6 f6Var = (f6) this.f1219c;
                boolean z12 = this.f1218b;
                MessagesController.getInstance(f6Var.C2).setStoryQuality(!z12);
                zc zcVar = new zc(f6Var.f953c1, f6Var.B0);
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
                w5 w5Var = f6Var.f1004t1;
                if (w5Var != null) {
                    w5Var.a();
                    return;
                }
                return;
            case 1:
                w5 w5Var2 = (w5) this.f1219c;
                boolean z13 = this.f1218b;
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean z14 = !z13;
                    if (d2Var.f809n && d2Var.f810r != z14) {
                        d2Var.f810r = z14;
                        NativeInstance nativeInstance = d2Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                w5 w5Var3 = w5Var2.f1858l.f1004t1;
                if (w5Var3 != null) {
                    w5Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f1219c;
                boolean z15 = this.f1218b;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
                if (m1Var != null && m1Var.isShowing() && z15) {
                    if (!u0Var.T) {
                        u0Var.T = true;
                        u0Var.d.d(u0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var.f21311c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = u0Var.P;
                if (q0Var != null) {
                    q0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                fc1 fc1Var = (fc1) this.f1219c;
                boolean z16 = this.f1218b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) fc1Var.f37719b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f23518a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1219c;
                boolean z17 = this.f1218b;
                ud udVar = chatActivityEnterView.f23673i5;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean V0 = chatActivityEnterView.V0();
                if (!z17 && (rfVar = chatActivityEnterView.L0) != null) {
                    rfVar.h(!V0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.f23667h5 = !V0;
                AndroidUtilities.cancelRunOnUIThread(udVar);
                AndroidUtilities.runOnUIThread(udVar, 500L);
                return;
            case 5:
                aj ajVar = (aj) this.f1219c;
                boolean z18 = this.f1218b;
                org.telegram.ui.ActionBar.m2 m2Var = ajVar.f24342f0;
                if (ajVar.T0 != 0) {
                    ajVar.f24333c2.A0();
                    ajVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                ir0 ir0Var = new ir0(hashMap, arrayList, 0, true, (eo) m2Var);
                zh zhVar = new zh(ajVar, hashMap, arrayList);
                dr0 dr0Var = ir0Var.f38974a;
                dr0Var.f36891s0 = zhVar;
                dr0 dr0Var2 = ir0Var.f38975b;
                dr0Var2.f36891s0 = zhVar;
                dr0Var.f36892t0 = new hr0(ir0Var, 0);
                dr0Var2.f36892t0 = new hr0(ir0Var, 1);
                int i14 = ajVar.V1;
                boolean z19 = ajVar.W1;
                dr0Var.f0(i14, z19);
                ir0Var.f38975b.f0(i14, z19);
                if (z18) {
                    m2Var.showAsSheet(ir0Var);
                } else {
                    m2Var.presentFragment(ir0Var);
                }
                ajVar.dismiss();
                return;
            case 6:
                jh0 jh0Var = (jh0) this.f1219c;
                boolean z20 = this.f1218b;
                jh0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new gv(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                ov ovVar = jh0Var.U;
                if (ovVar != null) {
                    ovVar.I();
                    return;
                }
                PhotoViewer photoViewer = jh0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f33700a9 != null) {
                        PhotoViewer.f33700a9.G0(false, true);
                    }
                    lu0 lu0Var = photoViewer.f33750f0;
                    if (lu0Var != null && lu0Var.f31507f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                lu0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        lu0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) lu0Var.f31507f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(lu0Var.f31507f);
                        }
                        lu0Var.addView(lu0Var.f31507f, 0, w7.w5.e(-1, -1, 51));
                        jh0.j(false);
                    }
                    PhotoViewer.f33700a9 = PhotoViewer.f33701b9;
                    PhotoViewer.f33701b9 = null;
                    if (photoViewer.f33750f0 == null) {
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
                    if (photoViewer.f33750f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f33922y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f33919y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f33750f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            sl0 o9 = jh0.o(photoViewer.f33922y2.getAspectRatio(), false);
                            float f7 = o9.f30589c / photoViewer.f33913x3.getLayoutParams().width;
                            photoViewer.f33913x3.setScaleX(f7);
                            photoViewer.f33913x3.setScaleY(f7);
                            photoViewer.f33913x3.setTranslationX(o9.f30587a);
                            photoViewer.f33913x3.setTranslationY(o9.f30588b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f30587a - photoViewer.f33922y2.getX());
                            view3.setTranslationY(o9.f30588b - photoViewer.f33922y2.getY());
                            xu0 xu0Var = photoViewer.E2;
                            if (xu0Var != null) {
                                xu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            jt0 jt0Var = new jt0(photoViewer, f7, 1);
                            view3.setOutlineProvider(jt0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f33913x3.setOutlineProvider(jt0Var);
                            photoViewer.f33913x3.setClipToOutline(true);
                            xu0 xu0Var2 = photoViewer.E2;
                            if (xu0Var2 != null) {
                                xu0Var2.setOutlineProvider(jt0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            jh0.j(true);
                        }
                    } else {
                        photoViewer.f33814m6 = 0.0f;
                    }
                    try {
                        photoViewer.f33740e = true;
                        photoViewer.f33749f = true;
                        ((WindowManager) photoViewer.f33919y.getSystemService("window")).addView(photoViewer.f33758g0, photoViewer.f33731d0);
                        Activity activity = photoViewer.f33919y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f33615a1.add(photoViewer.f33864s1);
                        }
                        gv0 gv0Var = photoViewer.f33736d5;
                        if (gv0Var != null && !gv0Var.f38163s) {
                            gv0Var.f38147a.setVisible(false, false);
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    if (photoViewer.D2) {
                        i2.f0 f0Var = photoViewer.F2.d;
                        if (f0Var != null) {
                            f0Var.x1(null);
                        }
                        photoViewer.F2.U(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f33741e0.invalidate();
                        photoViewer.f33893v3 = 4;
                        return;
                    }
                    photoViewer.f33893v3 = 4;
                    return;
                }
                return;
            case 7:
                wb0 wb0Var = (wb0) this.f1219c;
                if (!this.f1218b) {
                    org.telegram.ui.Cells.w8 w8Var = wb0Var.f43122n;
                    if (w8Var != null && w8Var.f23451e.h) {
                        int i15 = -wb0Var.N;
                        wb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(w8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    boolean z21 = w8Var2.f23451e.h;
                    w8Var2.setChecked(!z21);
                    wb0Var.Z(z21);
                    org.telegram.ui.Cells.w8 w8Var3 = wb0Var.f43122n;
                    if (w8Var3 != null) {
                        if (w8Var2.f23451e.h) {
                            w8Var3.setChecked(false);
                            wb0Var.f43122n.setCheckBoxIcon(R.drawable.permission_locked);
                            wb0Var.f43123r.setVisibility(8);
                            return;
                        } else if (wb0Var.f43120e == null) {
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
                wg0 wg0Var = (wg0) this.f1219c;
                boolean z22 = this.f1218b;
                xg0 xg0Var = wg0Var.V;
                if (xg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !xg0Var.E;
                    xg0Var.E = z24;
                    ((org.telegram.ui.Cells.a2) view).c(z24, true);
                    if (((z22 && xg0Var.getConnectionsManager().isTestBackend()) ? false : false) != xg0Var.E) {
                        xg0Var.getConnectionsManager().switchBackend(false);
                    }
                    wg0Var.r();
                    return;
                }
                return;
        }
    }
}
