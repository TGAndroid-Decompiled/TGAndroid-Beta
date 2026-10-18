package ci;

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
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.rd;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cb0;
import org.telegram.ui.cu0;
import org.telegram.ui.eg0;
import org.telegram.ui.fg0;
import org.telegram.ui.lq0;
import org.telegram.ui.lu0;
import org.telegram.ui.pq0;
import org.telegram.ui.ps0;
import org.telegram.ui.qq0;
import org.telegram.ui.qt0;
import org.telegram.ui.sa1;
import org.telegram.ui.sn;
public final class h2 implements View.OnClickListener {
    public final int f5453a;
    public final boolean f5454b;
    public final Object f5455c;

    public h2(int i10, Object obj, boolean z10) {
        this.f5453a = i10;
        this.f5455c = obj;
        this.f5454b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        mf mfVar;
        boolean z11;
        View view2;
        switch (this.f5453a) {
            case 0:
                q4 q4Var = (q4) this.f5455c;
                boolean z12 = this.f5454b;
                MessagesController.getInstance(q4Var.C2).setStoryQuality(!z12);
                xc xcVar = new xc(q4Var.f5772c1, q4Var.B0);
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
                h4 h4Var = q4Var.f5824t1;
                if (h4Var != null) {
                    h4Var.a();
                    return;
                }
                return;
            case 1:
                h4 h4Var2 = (h4) this.f5455c;
                boolean z13 = this.f5454b;
                h1 h1Var = h1.W;
                if (h1Var != null) {
                    boolean z14 = !z13;
                    if (h1Var.f5447n && h1Var.f5448r != z14) {
                        h1Var.f5448r = z14;
                        NativeInstance nativeInstance = h1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                h4 h4Var3 = h4Var2.f5464l.f5824t1;
                if (h4Var3 != null) {
                    h4Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f5455c;
                boolean z15 = this.f5454b;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
                if (m1Var != null && m1Var.isShowing() && z15) {
                    if (!u0Var.T) {
                        u0Var.T = true;
                        u0Var.d.d(u0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var.f21737c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = u0Var.P;
                if (q0Var != null) {
                    q0Var.j(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                sa1 sa1Var = (sa1) this.f5455c;
                boolean z16 = this.f5454b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) sa1Var.f41072b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f23834a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f5455c;
                boolean z17 = this.f5454b;
                rd rdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z17 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.h(!Q0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !Q0;
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                AndroidUtilities.runOnUIThread(rdVar, 500L);
                return;
            case 5:
                ti tiVar = (ti) this.f5455c;
                boolean z18 = this.f5454b;
                org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30581f0;
                if (tiVar.T0 != 0) {
                    tiVar.f30573c2.E();
                    tiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                qq0 qq0Var = new qq0(hashMap, arrayList, 0, true, (sn) n2Var);
                th thVar = new th(tiVar, hashMap, arrayList);
                lq0 lq0Var = qq0Var.f40505a;
                lq0Var.f38935s0 = thVar;
                lq0 lq0Var2 = qq0Var.f40506b;
                lq0Var2.f38935s0 = thVar;
                lq0Var.f38936t0 = new pq0(qq0Var, 0);
                lq0Var2.f38936t0 = new pq0(qq0Var, 1);
                int i14 = tiVar.V1;
                boolean z19 = tiVar.W1;
                lq0Var.f0(i14, z19);
                qq0Var.f40506b.f0(i14, z19);
                if (z18) {
                    n2Var.showAsSheet(qq0Var);
                } else {
                    n2Var.presentFragment(qq0Var);
                }
                tiVar.dismiss();
                return;
            case 6:
                zg0 zg0Var = (zg0) this.f5455c;
                boolean z20 = this.f5454b;
                zg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.F1)) {
                    LaunchActivity.G1 = new uu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                cv cvVar = zg0Var.U;
                if (cvVar != null) {
                    cvVar.I();
                    return;
                }
                PhotoViewer photoViewer = zg0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f33233a9 != null) {
                        PhotoViewer.f33233a9.G0(false, true);
                    }
                    qt0 qt0Var = photoViewer.f33282f0;
                    if (qt0Var != null && qt0Var.f27873f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                qt0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        qt0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) qt0Var.f27873f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(qt0Var.f27873f);
                        }
                        qt0Var.addView(qt0Var.f27873f, 0, w7.z5.e(-1, -1, 51));
                        zg0.j(false);
                    }
                    PhotoViewer.f33233a9 = PhotoViewer.f33234b9;
                    PhotoViewer.f33234b9 = null;
                    if (photoViewer.f33282f0 == null) {
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
                    if (photoViewer.f33282f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f33455y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f33452y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f33282f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            el0 o10 = zg0.o(photoViewer.f33455y2.getAspectRatio(), false);
                            float f7 = o10.f25965c / photoViewer.f33446x3.getLayoutParams().width;
                            photoViewer.f33446x3.setScaleX(f7);
                            photoViewer.f33446x3.setScaleY(f7);
                            photoViewer.f33446x3.setTranslationX(o10.f25963a);
                            photoViewer.f33446x3.setTranslationY(o10.f25964b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o10.f25963a - photoViewer.f33455y2.getX());
                            view3.setTranslationY(o10.f25964b - photoViewer.f33455y2.getY());
                            cu0 cu0Var = photoViewer.E2;
                            if (cu0Var != null) {
                                cu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            ps0 ps0Var = new ps0(photoViewer, f7, 1);
                            view3.setOutlineProvider(ps0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f33446x3.setOutlineProvider(ps0Var);
                            photoViewer.f33446x3.setClipToOutline(true);
                            cu0 cu0Var2 = photoViewer.E2;
                            if (cu0Var2 != null) {
                                cu0Var2.setOutlineProvider(ps0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            zg0.j(true);
                        }
                    } else {
                        photoViewer.f33347m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f33281f = true;
                        ((WindowManager) photoViewer.f33452y.getSystemService("window")).addView(photoViewer.f33290g0, photoViewer.f33264d0);
                        Activity activity = photoViewer.f33452y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f33151a1.add(photoViewer.f33397s1);
                        }
                        lu0 lu0Var = photoViewer.f33269d5;
                        if (lu0Var != null && !lu0Var.f38976s) {
                            lu0Var.f38961a.setVisible(false, false);
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
                        photoViewer.f33273e0.invalidate();
                        photoViewer.f33426v3 = 4;
                        return;
                    }
                    photoViewer.f33426v3 = 4;
                    return;
                }
                return;
            case 7:
                cb0 cb0Var = (cb0) this.f5455c;
                if (!this.f5454b) {
                    org.telegram.ui.Cells.v8 v8Var = cb0Var.f35914n;
                    if (v8Var != null && v8Var.e.h) {
                        int i15 = -cb0Var.N;
                        cb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(v8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.v8 v8Var2 = (org.telegram.ui.Cells.v8) view;
                    boolean z21 = v8Var2.e.h;
                    v8Var2.setChecked(!z21);
                    cb0Var.Z(z21);
                    org.telegram.ui.Cells.v8 v8Var3 = cb0Var.f35914n;
                    if (v8Var3 != null) {
                        if (v8Var2.e.h) {
                            v8Var3.setChecked(false);
                            cb0Var.f35914n.setCheckBoxIcon(R.drawable.permission_locked);
                            cb0Var.f35915r.setVisibility(8);
                            return;
                        } else if (cb0Var.e == null) {
                            v8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                eg0 eg0Var = (eg0) this.f5455c;
                boolean z22 = this.f5454b;
                fg0 fg0Var = eg0Var.V;
                if (fg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !fg0Var.E;
                    fg0Var.E = z24;
                    ((org.telegram.ui.Cells.a2) view).c(z24, true);
                    if (((z22 && fg0Var.getConnectionsManager().isTestBackend()) ? false : false) != fg0Var.E) {
                        fg0Var.getConnectionsManager().switchBackend(false);
                    }
                    eg0Var.r();
                    return;
                }
                return;
        }
    }
}
