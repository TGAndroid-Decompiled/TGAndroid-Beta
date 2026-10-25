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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.db0;
import org.telegram.ui.fg0;
import org.telegram.ui.gg0;
import org.telegram.ui.hu0;
import org.telegram.ui.qu0;
import org.telegram.ui.rq0;
import org.telegram.ui.un;
import org.telegram.ui.uq0;
import org.telegram.ui.us0;
import org.telegram.ui.vq0;
import org.telegram.ui.vt0;
import org.telegram.ui.xa1;
public final class g2 implements View.OnClickListener {
    public final int f8574a;
    public final boolean f8575b;
    public final Object f8576c;

    public g2(int i10, Object obj, boolean z10) {
        this.f8574a = i10;
        this.f8576c = obj;
        this.f8575b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        mf mfVar;
        boolean z11;
        View view2;
        switch (this.f8574a) {
            case 0:
                q4 q4Var = (q4) this.f8576c;
                boolean z12 = this.f8575b;
                MessagesController.getInstance(q4Var.f9021r2).setStoryQuality(!z12);
                wc wcVar = new wc(q4Var.R0, q4Var.f9015q0);
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
                h4 h4Var = q4Var.f8988i1;
                if (h4Var != null) {
                    h4Var.a();
                    return;
                }
                return;
            case 1:
                h4 h4Var2 = (h4) this.f8576c;
                boolean z13 = this.f8575b;
                h1 h1Var = h1.W;
                if (h1Var != null) {
                    boolean z14 = !z13;
                    if (h1Var.f8608n && h1Var.f8609r != z14) {
                        h1Var.f8609r = z14;
                        NativeInstance nativeInstance = h1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                h4 h4Var3 = h4Var2.f8626l.f8988i1;
                if (h4Var3 != null) {
                    h4Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f8576c;
                boolean z15 = this.f8575b;
                if (w0Var.x() && z15) {
                    if (!w0Var.T) {
                        w0Var.T = true;
                        w0Var.q();
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var.f23176c;
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
                xa1 xa1Var = (xa1) this.f8576c;
                boolean z16 = this.f8575b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) xa1Var.f45711b)[i13];
                    org.telegram.ui.Cells.w0 w0Var2 = x0Var.f25679a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f8576c;
                boolean z17 = this.f8575b;
                sd sdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z17 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.g(!Q0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !Q0;
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                AndroidUtilities.runOnUIThread(sdVar, 500L);
                return;
            case 5:
                ti tiVar = (ti) this.f8576c;
                boolean z18 = this.f8575b;
                org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33018f0;
                if (tiVar.T0 != 0) {
                    tiVar.f33010c2.H();
                    tiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                vq0 vq0Var = new vq0(hashMap, arrayList, 0, true, (un) r2Var);
                ii iiVar = new ii(tiVar, hashMap, arrayList);
                rq0 rq0Var = vq0Var.f44882a;
                rq0Var.f43263s0 = iiVar;
                rq0 rq0Var2 = vq0Var.f44883b;
                rq0Var2.f43263s0 = iiVar;
                rq0Var.f43264t0 = new uq0(vq0Var, 0);
                rq0Var2.f43264t0 = new uq0(vq0Var, 1);
                int i14 = tiVar.V1;
                boolean z19 = tiVar.W1;
                rq0Var.g0(i14, z19);
                vq0Var.f44883b.g0(i14, z19);
                if (z18) {
                    r2Var.showAsSheet(vq0Var);
                } else {
                    r2Var.presentFragment(vq0Var);
                }
                tiVar.dismiss();
                return;
            case 6:
                ch0 ch0Var = (ch0) this.f8576c;
                boolean z20 = this.f8575b;
                ch0Var.getClass();
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
                dv dvVar = ch0Var.U;
                if (dvVar != null) {
                    dvVar.H();
                    return;
                }
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f35603a9 != null) {
                        PhotoViewer.f35603a9.H0(false, true);
                    }
                    vt0 vt0Var = photoViewer.f35653f0;
                    if (vt0Var != null && vt0Var.f30575f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                vt0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        vt0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) vt0Var.f30575f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(vt0Var.f30575f);
                        }
                        vt0Var.addView(vt0Var.f30575f, 0, gb1.i(-1, -1, 51));
                        ch0.j(false);
                    }
                    PhotoViewer.f35603a9 = PhotoViewer.f35604b9;
                    PhotoViewer.f35604b9 = null;
                    if (photoViewer.f35653f0 == null) {
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
                    if (photoViewer.f35653f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f35825y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f35822y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f35653f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            hl0 o10 = ch0.o(photoViewer.f35825y2.getAspectRatio(), false);
                            float f7 = o10.f29009c / photoViewer.f35816x3.getLayoutParams().width;
                            photoViewer.f35816x3.setScaleX(f7);
                            photoViewer.f35816x3.setScaleY(f7);
                            photoViewer.f35816x3.setTranslationX(o10.f29007a);
                            photoViewer.f35816x3.setTranslationY(o10.f29008b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o10.f29007a - photoViewer.f35825y2.getX());
                            view3.setTranslationY(o10.f29008b - photoViewer.f35825y2.getY());
                            hu0 hu0Var = photoViewer.E2;
                            if (hu0Var != null) {
                                hu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            us0 us0Var = new us0(photoViewer, f7, 1);
                            view3.setOutlineProvider(us0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f35816x3.setOutlineProvider(us0Var);
                            photoViewer.f35816x3.setClipToOutline(true);
                            hu0 hu0Var2 = photoViewer.E2;
                            if (hu0Var2 != null) {
                                hu0Var2.setOutlineProvider(us0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            ch0.j(true);
                        }
                    } else {
                        photoViewer.f35717m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f35652f = true;
                        ((WindowManager) photoViewer.f35822y.getSystemService("window")).addView(photoViewer.f35661g0, photoViewer.f35634d0);
                        Activity activity = photoViewer.f35822y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f35523b1.add(photoViewer.f35767s1);
                        }
                        qu0 qu0Var = photoViewer.f35639d5;
                        if (qu0Var != null && !qu0Var.f42931s) {
                            qu0Var.f42916a.setVisible(false, false);
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
                        photoViewer.f35643e0.invalidate();
                        photoViewer.f35796v3 = 4;
                        return;
                    }
                    photoViewer.f35796v3 = 4;
                    return;
                }
                return;
            case 7:
                db0 db0Var = (db0) this.f8576c;
                if (!this.f8575b) {
                    org.telegram.ui.Cells.a9 a9Var = db0Var.f38816n;
                    if (a9Var != null && a9Var.e.h) {
                        int i15 = -db0Var.M;
                        db0Var.M = i15;
                        AndroidUtilities.shakeViewSpring(a9Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
                    boolean z21 = a9Var2.e.h;
                    a9Var2.setChecked(!z21);
                    db0Var.a0(z21);
                    org.telegram.ui.Cells.a9 a9Var3 = db0Var.f38816n;
                    if (a9Var3 != null) {
                        if (a9Var2.e.h) {
                            a9Var3.setChecked(false);
                            db0Var.f38816n.setCheckBoxIcon(R.drawable.permission_locked);
                            db0Var.f38817r.setVisibility(8);
                            return;
                        } else if (db0Var.e == null) {
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
                fg0 fg0Var = (fg0) this.f8576c;
                boolean z22 = this.f8575b;
                gg0 gg0Var = fg0Var.f39359a0;
                if (gg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !gg0Var.E;
                    gg0Var.E = z24;
                    ((org.telegram.ui.Cells.y1) view).c(z24, true);
                    if (((z22 && gg0Var.getConnectionsManager().isTestBackend()) ? false : false) != gg0Var.E) {
                        gg0Var.getConnectionsManager().switchBackend(false);
                    }
                    fg0Var.q();
                    return;
                }
                return;
        }
    }
}
