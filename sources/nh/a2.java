package nh;

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
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import org.telegram.ui.fq0;
import org.telegram.ui.hb1;
import org.telegram.ui.jq0;
import org.telegram.ui.ju0;
import org.telegram.ui.kq0;
import org.telegram.ui.mg0;
import org.telegram.ui.ms0;
import org.telegram.ui.nb0;
import org.telegram.ui.ng0;
import org.telegram.ui.nt0;
import org.telegram.ui.xn;
public final class a2 implements View.OnClickListener {
    public final int f15046a;
    public final boolean f15047b;
    public final Object f15048c;

    public a2(int i10, Object obj, boolean z4) {
        this.f15046a = i10;
        this.f15048c = obj;
        this.f15047b = z4;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z4;
        cf cfVar;
        boolean z10;
        View view2;
        switch (this.f15046a) {
            case 0:
                d4 d4Var = (d4) this.f15048c;
                boolean z11 = this.f15047b;
                MessagesController.getInstance(d4Var.f15263z2).setStoryQuality(!z11);
                qc qcVar = new qc(d4Var.Z0, d4Var.f15257y0);
                int i12 = R.raw.chats_infotip;
                if (!z11) {
                    i10 = R.string.StoryQualityIncreasedTitle;
                } else {
                    i10 = R.string.StoryQualityDecreasedTitle;
                }
                String string = LocaleController.getString(i10);
                if (!z11) {
                    i11 = R.string.StoryQualityIncreasedMessage;
                } else {
                    i11 = R.string.StoryQualityDecreasedMessage;
                }
                qcVar.M(string, LocaleController.getString(i11), i12).j();
                w3 w3Var = d4Var.f15228q1;
                if (w3Var != null) {
                    w3Var.a();
                    return;
                }
                return;
            case 1:
                w3 w3Var2 = (w3) this.f15048c;
                boolean z12 = this.f15047b;
                e1 e1Var = e1.T;
                if (e1Var != null) {
                    boolean z13 = !z12;
                    if (e1Var.f15296n && e1Var.f15297r != z13) {
                        e1Var.f15297r = z13;
                        NativeInstance nativeInstance = e1Var.B;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z13);
                        }
                    }
                }
                w3 w3Var3 = w3Var2.f16027l.f15228q1;
                if (w3Var3 != null) {
                    w3Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f15048c;
                boolean z14 = this.f15047b;
                org.telegram.ui.ActionBar.p1 p1Var = w0Var.d;
                if (p1Var != null && p1Var.isShowing() && z14) {
                    if (!w0Var.Q) {
                        w0Var.Q = true;
                        w0Var.d.d(w0Var.O);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var.f20651c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.s0 s0Var = w0Var.M;
                if (s0Var != null) {
                    s0Var.l(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                hb1 hb1Var = (hb1) this.f15048c;
                boolean z15 = this.f15047b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) hb1Var.f34810b)[i13];
                    org.telegram.ui.Cells.w0 w0Var2 = x0Var.f22565a;
                    if (x0Var == view) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    w0Var2.a(z4, true);
                }
                SharedConfig.setUseThreeLinesLayout(z15);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f15048c;
                boolean z16 = this.f15047b;
                id idVar = chatActivityEnterView.B4;
                chatActivityEnterView.J0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z16 && (cfVar = chatActivityEnterView.I0) != null) {
                    cfVar.h(!S0);
                    chatActivityEnterView.I0 = null;
                    return;
                }
                chatActivityEnterView.A4 = !S0;
                AndroidUtilities.cancelRunOnUIThread(idVar);
                AndroidUtilities.runOnUIThread(idVar, 500L);
                return;
            case 5:
                li liVar = (li) this.f15048c;
                boolean z17 = this.f15047b;
                org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
                if (liVar.N0 != 0) {
                    liVar.W1.r();
                    liVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                kq0 kq0Var = new kq0(hashMap, arrayList, 0, true, (xn) p2Var);
                jh jhVar = new jh(liVar, hashMap, arrayList);
                fq0 fq0Var = kq0Var.f35788a;
                fq0Var.f34332p0 = jhVar;
                fq0 fq0Var2 = kq0Var.f35789b;
                fq0Var2.f34332p0 = jhVar;
                fq0Var.f34333q0 = new jq0(kq0Var, 0);
                fq0Var2.f34333q0 = new jq0(kq0Var, 1);
                int i14 = liVar.P1;
                boolean z18 = liVar.Q1;
                fq0Var.f0(i14, z18);
                kq0Var.f35789b.f0(i14, z18);
                if (z17) {
                    p2Var.showAsSheet(kq0Var);
                } else {
                    p2Var.presentFragment(kq0Var);
                }
                liVar.dismiss();
                return;
            case 6:
                lg0 lg0Var = (lg0) this.f15048c;
                boolean z19 = this.f15047b;
                lg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z19 && (!z10 || !LaunchActivity.B1)) {
                    LaunchActivity.C1 = new hu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                pu puVar = lg0Var.R;
                if (puVar != null) {
                    puVar.H();
                    return;
                }
                PhotoViewer photoViewer = lg0Var.S;
                if (photoViewer != null && photoViewer.G3) {
                    if (PhotoViewer.W8 != null) {
                        PhotoViewer.W8.G0(false, true);
                    }
                    nt0 nt0Var = photoViewer.f31715c0;
                    if (nt0Var != null && nt0Var.f29451f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                nt0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        nt0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) nt0Var.f29451f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(nt0Var.f29451f);
                        }
                        nt0Var.addView(nt0Var.f29451f, 0, k7.b6.e(-1, -1, 51));
                        lg0.j(false);
                    }
                    PhotoViewer.W8 = PhotoViewer.X8;
                    PhotoViewer.X8 = null;
                    if (photoViewer.f31715c0 == null) {
                        photoViewer.I3 = true;
                        Bitmap bitmap = photoViewer.f31926z3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.f31926z3 = null;
                        }
                        photoViewer.C3 = true;
                    }
                    photoViewer.G3 = false;
                    if (photoViewer.A2) {
                        view2 = photoViewer.f31925z2;
                    } else {
                        view2 = photoViewer.f31916y2;
                    }
                    View view3 = view2;
                    if (photoViewer.f31715c0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f31886v2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f31913y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f31715c0 == null) {
                        if (view3 != null) {
                            photoViewer.f31917y3 = true;
                            sk0 o10 = lg0.o(photoViewer.f31886v2.getAspectRatio(), false);
                            float f10 = o10.f28724c / photoViewer.f31878u3.getLayoutParams().width;
                            photoViewer.f31878u3.setScaleX(f10);
                            photoViewer.f31878u3.setScaleY(f10);
                            photoViewer.f31878u3.setTranslationX(o10.f28722a);
                            photoViewer.f31878u3.setTranslationY(o10.f28723b);
                            view3.setScaleX(f10);
                            view3.setScaleY(f10);
                            view3.setTranslationX(o10.f28722a - photoViewer.f31886v2.getX());
                            view3.setTranslationY(o10.f28723b - photoViewer.f31886v2.getY());
                            au0 au0Var = photoViewer.B2;
                            if (au0Var != null) {
                                au0Var.setScaleX(f10);
                                photoViewer.B2.setScaleY(f10);
                                photoViewer.B2.setTranslationX(view3.getTranslationX());
                                photoViewer.B2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.T = 0.0f;
                            ms0 ms0Var = new ms0(photoViewer, f10, 1);
                            view3.setOutlineProvider(ms0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f31878u3.setOutlineProvider(ms0Var);
                            photoViewer.f31878u3.setClipToOutline(true);
                            au0 au0Var2 = photoViewer.B2;
                            if (au0Var2 != null) {
                                au0Var2.setOutlineProvider(ms0Var);
                                photoViewer.B2.setClipToOutline(true);
                            }
                        } else {
                            lg0.j(true);
                        }
                    } else {
                        photoViewer.f31783j6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f31740f = true;
                        ((WindowManager) photoViewer.f31913y.getSystemService("window")).addView(photoViewer.f31723d0, photoViewer.f31696a0);
                        Activity activity = photoViewer.f31913y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).X0.add(photoViewer.f31831p1);
                        }
                        ju0 ju0Var = photoViewer.f31700a5;
                        if (ju0Var != null && !ju0Var.f35510s) {
                            ju0Var.f35495a.setVisible(false, false);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (photoViewer.A2) {
                        j3.f0 f0Var = photoViewer.C2.d;
                        if (f0Var != null) {
                            f0Var.c0(null);
                        }
                        photoViewer.C2.U(photoViewer.f31925z2);
                        photoViewer.f31925z2.setVisibility(4);
                        photoViewer.D3 = 2;
                        photoViewer.C3 = false;
                        photoViewer.f31705b0.invalidate();
                        photoViewer.f31862s3 = 4;
                        return;
                    }
                    photoViewer.f31862s3 = 4;
                    return;
                }
                return;
            case 7:
                nb0 nb0Var = (nb0) this.f15048c;
                if (!this.f15047b) {
                    org.telegram.ui.Cells.s8 s8Var = nb0Var.f36566n;
                    if (s8Var != null && s8Var.e.h) {
                        int i15 = -nb0Var.K;
                        nb0Var.K = i15;
                        AndroidUtilities.shakeViewSpring(s8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                    boolean z20 = s8Var2.e.h;
                    s8Var2.setChecked(!z20);
                    nb0Var.Z(z20);
                    org.telegram.ui.Cells.s8 s8Var3 = nb0Var.f36566n;
                    if (s8Var3 != null) {
                        if (s8Var2.e.h) {
                            s8Var3.setChecked(false);
                            nb0Var.f36566n.setCheckBoxIcon(R.drawable.permission_locked);
                            nb0Var.f36567r.setVisibility(8);
                            return;
                        } else if (nb0Var.e == null) {
                            s8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                mg0 mg0Var = (mg0) this.f15048c;
                boolean z21 = this.f15047b;
                ng0 ng0Var = mg0Var.S;
                if (ng0Var.getParentActivity() != null) {
                    boolean z22 = true;
                    boolean z23 = !ng0Var.B;
                    ng0Var.B = z23;
                    ((org.telegram.ui.Cells.z1) view).c(z23, true);
                    if (((z21 && ng0Var.getConnectionsManager().isTestBackend()) ? false : false) != ng0Var.B) {
                        ng0Var.getConnectionsManager().switchBackend(false);
                    }
                    mg0Var.s();
                    return;
                }
                return;
        }
    }
}
