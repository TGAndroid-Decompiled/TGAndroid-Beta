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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.vd;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.br0;
import org.telegram.ui.dc1;
import org.telegram.ui.ev0;
import org.telegram.ui.fr0;
import org.telegram.ui.gr0;
import org.telegram.ui.ht0;
import org.telegram.ui.ju0;
import org.telegram.ui.vb0;
import org.telegram.ui.vg0;
import org.telegram.ui.vu0;
import org.telegram.ui.wg0;
import org.telegram.ui.zn;
public final class k3 implements View.OnClickListener {
    public final int f1219a;
    public final boolean f1220b;
    public final Object f1221c;

    public k3(int i10, Object obj, boolean z10) {
        this.f1219a = i10;
        this.f1221c = obj;
        this.f1220b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        pf pfVar;
        boolean z11;
        View view2;
        switch (this.f1219a) {
            case 0:
                f6 f6Var = (f6) this.f1221c;
                boolean z12 = this.f1220b;
                MessagesController.getInstance(f6Var.C2).setStoryQuality(!z12);
                ad adVar = new ad(f6Var.f955c1, f6Var.B0);
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
                adVar.M(string, LocaleController.getString(i11), i12).j();
                w5 w5Var = f6Var.f1006t1;
                if (w5Var != null) {
                    w5Var.a();
                    return;
                }
                return;
            case 1:
                w5 w5Var2 = (w5) this.f1221c;
                boolean z13 = this.f1220b;
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean z14 = !z13;
                    if (d2Var.f811n && d2Var.f812r != z14) {
                        d2Var.f812r = z14;
                        NativeInstance nativeInstance = d2Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                w5 w5Var3 = w5Var2.f1860l.f1006t1;
                if (w5Var3 != null) {
                    w5Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f1221c;
                boolean z15 = this.f1220b;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
                if (n1Var != null && n1Var.isShowing() && z15) {
                    if (!v0Var.T) {
                        v0Var.T = true;
                        v0Var.d.d(v0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var.f21585c;
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
                dc1 dc1Var = (dc1) this.f1221c;
                boolean z16 = this.f1220b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) dc1Var.f36973b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f23757a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1221c;
                boolean z17 = this.f1220b;
                vd vdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z17 && (pfVar = chatActivityEnterView.L0) != null) {
                    pfVar.h(!Q0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !Q0;
                AndroidUtilities.cancelRunOnUIThread(vdVar);
                AndroidUtilities.runOnUIThread(vdVar, 500L);
                return;
            case 5:
                yi yiVar = (yi) this.f1221c;
                boolean z18 = this.f1220b;
                org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33235f0;
                if (yiVar.T0 != 0) {
                    yiVar.f33226c2.B0();
                    yiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                gr0 gr0Var = new gr0(hashMap, arrayList, 0, true, (zn) n2Var);
                xh xhVar = new xh(yiVar, hashMap, arrayList);
                br0 br0Var = gr0Var.f38128a;
                br0Var.f36458s0 = xhVar;
                br0 br0Var2 = gr0Var.f38129b;
                br0Var2.f36458s0 = xhVar;
                br0Var.f36459t0 = new fr0(gr0Var, 0);
                br0Var2.f36459t0 = new fr0(gr0Var, 1);
                int i14 = yiVar.V1;
                boolean z19 = yiVar.W1;
                br0Var.f0(i14, z19);
                gr0Var.f38129b.f0(i14, z19);
                if (z18) {
                    n2Var.showAsSheet(gr0Var);
                } else {
                    n2Var.presentFragment(gr0Var);
                }
                yiVar.dismiss();
                return;
            case 6:
                hh0 hh0Var = (hh0) this.f1221c;
                boolean z20 = this.f1220b;
                hh0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new ev(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                mv mvVar = hh0Var.U;
                if (mvVar != null) {
                    mvVar.I();
                    return;
                }
                PhotoViewer photoViewer = hh0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f33901a9 != null) {
                        PhotoViewer.f33901a9.G0(false, true);
                    }
                    ju0 ju0Var = photoViewer.f33951f0;
                    if (ju0Var != null && ju0Var.f31124f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                ju0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        ju0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) ju0Var.f31124f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(ju0Var.f31124f);
                        }
                        ju0Var.addView(ju0Var.f31124f, 0, w7.x5.e(-1, -1, 51));
                        hh0.j(false);
                    }
                    PhotoViewer.f33901a9 = PhotoViewer.f33902b9;
                    PhotoViewer.f33902b9 = null;
                    if (photoViewer.f33951f0 == null) {
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
                    if (photoViewer.f33951f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f34123y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f34120y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f33951f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            nl0 o9 = hh0.o(photoViewer.f34123y2.getAspectRatio(), false);
                            float f7 = o9.f29148c / photoViewer.f34114x3.getLayoutParams().width;
                            photoViewer.f34114x3.setScaleX(f7);
                            photoViewer.f34114x3.setScaleY(f7);
                            photoViewer.f34114x3.setTranslationX(o9.f29146a);
                            photoViewer.f34114x3.setTranslationY(o9.f29147b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f29146a - photoViewer.f34123y2.getX());
                            view3.setTranslationY(o9.f29147b - photoViewer.f34123y2.getY());
                            vu0 vu0Var = photoViewer.E2;
                            if (vu0Var != null) {
                                vu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            ht0 ht0Var = new ht0(photoViewer, f7, 1);
                            view3.setOutlineProvider(ht0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f34114x3.setOutlineProvider(ht0Var);
                            photoViewer.f34114x3.setClipToOutline(true);
                            vu0 vu0Var2 = photoViewer.E2;
                            if (vu0Var2 != null) {
                                vu0Var2.setOutlineProvider(ht0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            hh0.j(true);
                        }
                    } else {
                        photoViewer.f34015m6 = 0.0f;
                    }
                    try {
                        photoViewer.f33941e = true;
                        photoViewer.f33950f = true;
                        ((WindowManager) photoViewer.f34120y.getSystemService("window")).addView(photoViewer.f33959g0, photoViewer.f33932d0);
                        Activity activity = photoViewer.f34120y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f33816a1.add(photoViewer.f34065s1);
                        }
                        ev0 ev0Var = photoViewer.f33937d5;
                        if (ev0Var != null && !ev0Var.f37416s) {
                            ev0Var.f37400a.setVisible(false, false);
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
                        photoViewer.f33942e0.invalidate();
                        photoViewer.f34094v3 = 4;
                        return;
                    }
                    photoViewer.f34094v3 = 4;
                    return;
                }
                return;
            case 7:
                vb0 vb0Var = (vb0) this.f1221c;
                if (!this.f1220b) {
                    org.telegram.ui.Cells.w8 w8Var = vb0Var.f42853n;
                    if (w8Var != null && w8Var.f23692e.h) {
                        int i15 = -vb0Var.N;
                        vb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(w8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    boolean z21 = w8Var2.f23692e.h;
                    w8Var2.setChecked(!z21);
                    vb0Var.Z(z21);
                    org.telegram.ui.Cells.w8 w8Var3 = vb0Var.f42853n;
                    if (w8Var3 != null) {
                        if (w8Var2.f23692e.h) {
                            w8Var3.setChecked(false);
                            vb0Var.f42853n.setCheckBoxIcon(R.drawable.permission_locked);
                            vb0Var.f42854r.setVisibility(8);
                            return;
                        } else if (vb0Var.f42851e == null) {
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
                vg0 vg0Var = (vg0) this.f1221c;
                boolean z22 = this.f1220b;
                wg0 wg0Var = vg0Var.V;
                if (wg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !wg0Var.E;
                    wg0Var.E = z24;
                    ((org.telegram.ui.Cells.a2) view).c(z24, true);
                    if (((z22 && wg0Var.getConnectionsManager().isTestBackend()) ? false : false) != wg0Var.E) {
                        wg0Var.getConnectionsManager().switchBackend(false);
                    }
                    vg0Var.r();
                    return;
                }
                return;
        }
    }
}
