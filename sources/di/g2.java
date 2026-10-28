package di;

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
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fb0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.ju0;
import org.telegram.ui.su0;
import org.telegram.ui.tq0;
import org.telegram.ui.wn;
import org.telegram.ui.wq0;
import org.telegram.ui.ws0;
import org.telegram.ui.xq0;
import org.telegram.ui.xt0;
import org.telegram.ui.za1;
public final class g2 implements View.OnClickListener {
    public final int f8573a;
    public final boolean f8574b;
    public final Object f8575c;

    public g2(int i10, Object obj, boolean z10) {
        this.f8573a = i10;
        this.f8575c = obj;
        this.f8574b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        mf mfVar;
        boolean z11;
        View view2;
        switch (this.f8573a) {
            case 0:
                q4 q4Var = (q4) this.f8575c;
                boolean z12 = this.f8574b;
                MessagesController.getInstance(q4Var.f9020r2).setStoryQuality(!z12);
                wc wcVar = new wc(q4Var.R0, q4Var.f9014q0);
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
                wcVar.M(string, LocaleController.getString(i11), i12).j();
                h4 h4Var = q4Var.f8987i1;
                if (h4Var != null) {
                    h4Var.a();
                    return;
                }
                return;
            case 1:
                h4 h4Var2 = (h4) this.f8575c;
                boolean z13 = this.f8574b;
                h1 h1Var = h1.W;
                if (h1Var != null) {
                    boolean z14 = !z13;
                    if (h1Var.f8607n && h1Var.f8608r != z14) {
                        h1Var.f8608r = z14;
                        NativeInstance nativeInstance = h1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                h4 h4Var3 = h4Var2.f8625l.f8987i1;
                if (h4Var3 != null) {
                    h4Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f8575c;
                boolean z15 = this.f8574b;
                if (w0Var.x() && z15) {
                    if (!w0Var.T) {
                        w0Var.T = true;
                        w0Var.q();
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var.f23179c;
                if (zVar != null) {
                    zVar.n(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.r0 r0Var = w0Var.P;
                if (r0Var != null) {
                    r0Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                za1 za1Var = (za1) this.f8575c;
                boolean z16 = this.f8574b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) za1Var.f46212b)[i13];
                    org.telegram.ui.Cells.w0 w0Var2 = x0Var.f25683a;
                    if (x0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w0Var2.a(z10, true);
                }
                SharedConfig.setUseThreeLinesLayout(z16);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f8575c;
                boolean z17 = this.f8574b;
                sd sdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean P0 = chatActivityEnterView.P0();
                if (!z17 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.g(!P0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !P0;
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                AndroidUtilities.runOnUIThread(sdVar, 500L);
                return;
            case 5:
                ti tiVar = (ti) this.f8575c;
                boolean z18 = this.f8574b;
                org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
                if (tiVar.T0 != 0) {
                    tiVar.f32982c2.H();
                    tiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                xq0 xq0Var = new xq0(hashMap, arrayList, 0, true, (wn) r2Var);
                ii iiVar = new ii(tiVar, hashMap, arrayList);
                tq0 tq0Var = xq0Var.f45760a;
                tq0Var.f43752s0 = iiVar;
                tq0 tq0Var2 = xq0Var.f45761b;
                tq0Var2.f43752s0 = iiVar;
                tq0Var.f43753t0 = new wq0(xq0Var, 0);
                tq0Var2.f43753t0 = new wq0(xq0Var, 1);
                int i14 = tiVar.V1;
                boolean z19 = tiVar.W1;
                tq0Var.g0(i14, z19);
                xq0Var.f45761b.g0(i14, z19);
                if (z18) {
                    r2Var.showAsSheet(xq0Var);
                } else {
                    r2Var.presentFragment(xq0Var);
                }
                tiVar.dismiss();
                return;
            case 6:
                dh0 dh0Var = (dh0) this.f8575c;
                boolean z20 = this.f8574b;
                dh0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.G1)) {
                    LaunchActivity.H1 = new vu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                dv dvVar = dh0Var.U;
                if (dvVar != null) {
                    dvVar.H();
                    return;
                }
                PhotoViewer photoViewer = dh0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f35630a9 != null) {
                        PhotoViewer.f35630a9.H0(false, true);
                    }
                    xt0 xt0Var = photoViewer.f35680f0;
                    if (xt0Var != null && xt0Var.f30909f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                xt0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        xt0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) xt0Var.f30909f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(xt0Var.f30909f);
                        }
                        xt0Var.addView(xt0Var.f30909f, 0, kb1.i(-1, -1, 51));
                        dh0.j(false);
                    }
                    PhotoViewer.f35630a9 = PhotoViewer.f35631b9;
                    PhotoViewer.f35631b9 = null;
                    if (photoViewer.f35680f0 == null) {
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
                    if (photoViewer.f35680f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f35852y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f35849y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f35680f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            il0 o10 = dh0.o(photoViewer.f35852y2.getAspectRatio(), false);
                            float f7 = o10.f29383c / photoViewer.f35843x3.getLayoutParams().width;
                            photoViewer.f35843x3.setScaleX(f7);
                            photoViewer.f35843x3.setScaleY(f7);
                            photoViewer.f35843x3.setTranslationX(o10.f29381a);
                            photoViewer.f35843x3.setTranslationY(o10.f29382b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o10.f29381a - photoViewer.f35852y2.getX());
                            view3.setTranslationY(o10.f29382b - photoViewer.f35852y2.getY());
                            ju0 ju0Var = photoViewer.E2;
                            if (ju0Var != null) {
                                ju0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            ws0 ws0Var = new ws0(photoViewer, f7, 1);
                            view3.setOutlineProvider(ws0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f35843x3.setOutlineProvider(ws0Var);
                            photoViewer.f35843x3.setClipToOutline(true);
                            ju0 ju0Var2 = photoViewer.E2;
                            if (ju0Var2 != null) {
                                ju0Var2.setOutlineProvider(ws0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            dh0.j(true);
                        }
                    } else {
                        photoViewer.f35744m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f35679f = true;
                        ((WindowManager) photoViewer.f35849y.getSystemService("window")).addView(photoViewer.f35688g0, photoViewer.f35661d0);
                        Activity activity = photoViewer.f35849y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f35550b1.add(photoViewer.f35794s1);
                        }
                        su0 su0Var = photoViewer.f35666d5;
                        if (su0Var != null && !su0Var.f43421s) {
                            su0Var.f43406a.setVisible(false, false);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (photoViewer.D2) {
                        i2.j0 j0Var = photoViewer.F2.d;
                        if (j0Var != null) {
                            j0Var.z1(null);
                        }
                        photoViewer.F2.U(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f35670e0.invalidate();
                        photoViewer.f35823v3 = 4;
                        return;
                    }
                    photoViewer.f35823v3 = 4;
                    return;
                }
                return;
            case 7:
                fb0 fb0Var = (fb0) this.f8575c;
                if (!this.f8574b) {
                    org.telegram.ui.Cells.a9 a9Var = fb0Var.f39317n;
                    if (a9Var != null && a9Var.e.h) {
                        int i15 = -fb0Var.M;
                        fb0Var.M = i15;
                        AndroidUtilities.shakeViewSpring(a9Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
                    boolean z21 = a9Var2.e.h;
                    a9Var2.setChecked(!z21);
                    fb0Var.a0(z21);
                    org.telegram.ui.Cells.a9 a9Var3 = fb0Var.f39317n;
                    if (a9Var3 != null) {
                        if (a9Var2.e.h) {
                            a9Var3.setChecked(false);
                            fb0Var.f39317n.setCheckBoxIcon(R.drawable.permission_locked);
                            fb0Var.f39318r.setVisibility(8);
                            return;
                        } else if (fb0Var.e == null) {
                            a9Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                hg0 hg0Var = (hg0) this.f8575c;
                boolean z22 = this.f8574b;
                ig0 ig0Var = hg0Var.f39882a0;
                if (ig0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !ig0Var.E;
                    ig0Var.E = z24;
                    ((org.telegram.ui.Cells.y1) view).c(z24, true);
                    if (((z22 && ig0Var.getConnectionsManager().isTestBackend()) ? false : false) != ig0Var.E) {
                        ig0Var.getConnectionsManager().switchBackend(false);
                    }
                    hg0Var.q();
                    return;
                }
                return;
        }
    }
}
