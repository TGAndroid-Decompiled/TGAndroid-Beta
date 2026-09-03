package oh;

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
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hu0;
import org.telegram.ui.mq0;
import org.telegram.ui.ob0;
import org.telegram.ui.ob1;
import org.telegram.ui.og0;
import org.telegram.ui.qq0;
import org.telegram.ui.qu0;
import org.telegram.ui.rq0;
import org.telegram.ui.ts0;
import org.telegram.ui.ut0;
import org.telegram.ui.xn;
public final class b2 implements View.OnClickListener {
    public final int f16882a;
    public final boolean f16883b;
    public final Object f16884c;

    public b2(int i10, Object obj, boolean z4) {
        this.f16882a = i10;
        this.f16884c = obj;
        this.f16883b = z4;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z4;
        cf cfVar;
        boolean z10;
        View view2;
        switch (this.f16882a) {
            case 0:
                f4 f4Var = (f4) this.f16884c;
                boolean z11 = this.f16883b;
                MessagesController.getInstance(f4Var.f17135z2).setStoryQuality(!z11);
                qc qcVar = new qc(f4Var.Z0, f4Var.f17129y0);
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
                y3 y3Var = f4Var.f17100q1;
                if (y3Var != null) {
                    y3Var.a();
                    return;
                }
                return;
            case 1:
                y3 y3Var2 = (y3) this.f16884c;
                boolean z12 = this.f16883b;
                e1 e1Var = e1.T;
                if (e1Var != null) {
                    boolean z13 = !z12;
                    if (e1Var.f17009n && e1Var.f17010r != z13) {
                        e1Var.f17010r = z13;
                        NativeInstance nativeInstance = e1Var.B;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z13);
                        }
                    }
                }
                y3 y3Var3 = y3Var2.f17952l.f17100q1;
                if (y3Var3 != null) {
                    y3Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f16884c;
                boolean z14 = this.f16883b;
                org.telegram.ui.ActionBar.p1 p1Var = w0Var.d;
                if (p1Var != null && p1Var.isShowing() && z14) {
                    if (!w0Var.Q) {
                        w0Var.Q = true;
                        w0Var.d.d(w0Var.O);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var.f22348c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.s0 s0Var = w0Var.M;
                if (s0Var != null) {
                    s0Var.h(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                ob1 ob1Var = (ob1) this.f16884c;
                boolean z15 = this.f16883b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) ob1Var.f39651b)[i13];
                    org.telegram.ui.Cells.w0 w0Var2 = x0Var.f24388a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16884c;
                boolean z16 = this.f16883b;
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
                mi miVar = (mi) this.f16884c;
                boolean z17 = this.f16883b;
                org.telegram.ui.ActionBar.p2 p2Var = miVar.f29058c0;
                if (miVar.N0 != 0) {
                    miVar.W1.y0();
                    miVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                rq0 rq0Var = new rq0(hashMap, arrayList, 0, true, (xn) p2Var);
                jh jhVar = new jh(miVar, hashMap, arrayList);
                mq0 mq0Var = rq0Var.f40911a;
                mq0Var.f39051p0 = jhVar;
                mq0 mq0Var2 = rq0Var.f40912b;
                mq0Var2.f39051p0 = jhVar;
                mq0Var.f39052q0 = new qq0(rq0Var, 0);
                mq0Var2.f39052q0 = new qq0(rq0Var, 1);
                int i14 = miVar.P1;
                boolean z18 = miVar.Q1;
                mq0Var.f0(i14, z18);
                rq0Var.f40912b.f0(i14, z18);
                if (z17) {
                    p2Var.showAsSheet(rq0Var);
                } else {
                    p2Var.presentFragment(rq0Var);
                }
                miVar.dismiss();
                return;
            case 6:
                ng0 ng0Var = (ng0) this.f16884c;
                boolean z19 = this.f16883b;
                ng0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z19 && (!z10 || !LaunchActivity.B1)) {
                    LaunchActivity.C1 = new ju(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                ru ruVar = ng0Var.R;
                if (ruVar != null) {
                    ruVar.H();
                    return;
                }
                PhotoViewer photoViewer = ng0Var.S;
                if (photoViewer != null && photoViewer.G3) {
                    if (PhotoViewer.W8 != null) {
                        PhotoViewer.W8.G0(false, true);
                    }
                    ut0 ut0Var = photoViewer.f34240c0;
                    if (ut0Var != null && ut0Var.f33057f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                ut0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        ut0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) ut0Var.f33057f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(ut0Var.f33057f);
                        }
                        ut0Var.addView(ut0Var.f33057f, 0, k7.c6.e(-1, -1, 51));
                        ng0.j(false);
                    }
                    PhotoViewer.W8 = PhotoViewer.X8;
                    PhotoViewer.X8 = null;
                    if (photoViewer.f34240c0 == null) {
                        photoViewer.I3 = true;
                        Bitmap bitmap = photoViewer.f34452z3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.f34452z3 = null;
                        }
                        photoViewer.C3 = true;
                    }
                    photoViewer.G3 = false;
                    if (photoViewer.A2) {
                        view2 = photoViewer.f34451z2;
                    } else {
                        view2 = photoViewer.f34442y2;
                    }
                    View view3 = view2;
                    if (photoViewer.f34240c0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f34412v2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f34439y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f34240c0 == null) {
                        if (view3 != null) {
                            photoViewer.f34443y3 = true;
                            sk0 o10 = ng0.o(photoViewer.f34412v2.getAspectRatio(), false);
                            float f10 = o10.f31080c / photoViewer.f34404u3.getLayoutParams().width;
                            photoViewer.f34404u3.setScaleX(f10);
                            photoViewer.f34404u3.setScaleY(f10);
                            photoViewer.f34404u3.setTranslationX(o10.f31078a);
                            photoViewer.f34404u3.setTranslationY(o10.f31079b);
                            view3.setScaleX(f10);
                            view3.setScaleY(f10);
                            view3.setTranslationX(o10.f31078a - photoViewer.f34412v2.getX());
                            view3.setTranslationY(o10.f31079b - photoViewer.f34412v2.getY());
                            hu0 hu0Var = photoViewer.B2;
                            if (hu0Var != null) {
                                hu0Var.setScaleX(f10);
                                photoViewer.B2.setScaleY(f10);
                                photoViewer.B2.setTranslationX(view3.getTranslationX());
                                photoViewer.B2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.T = 0.0f;
                            ts0 ts0Var = new ts0(photoViewer, f10, 1);
                            view3.setOutlineProvider(ts0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f34404u3.setOutlineProvider(ts0Var);
                            photoViewer.f34404u3.setClipToOutline(true);
                            hu0 hu0Var2 = photoViewer.B2;
                            if (hu0Var2 != null) {
                                hu0Var2.setOutlineProvider(ts0Var);
                                photoViewer.B2.setClipToOutline(true);
                            }
                        } else {
                            ng0.j(true);
                        }
                    } else {
                        photoViewer.f34309j6 = 0.0f;
                    }
                    try {
                        photoViewer.f34257e = true;
                        photoViewer.f34266f = true;
                        ((WindowManager) photoViewer.f34439y.getSystemService("window")).addView(photoViewer.f34248d0, photoViewer.f34221a0);
                        Activity activity = photoViewer.f34439y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).X0.add(photoViewer.f34357p1);
                        }
                        qu0 qu0Var = photoViewer.f34225a5;
                        if (qu0Var != null && !qu0Var.f40694s) {
                            qu0Var.f40678a.setVisible(false, false);
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                    if (photoViewer.A2) {
                        j3.f0 f0Var = photoViewer.C2.d;
                        if (f0Var != null) {
                            f0Var.c0(null);
                        }
                        photoViewer.C2.U(photoViewer.f34451z2);
                        photoViewer.f34451z2.setVisibility(4);
                        photoViewer.D3 = 2;
                        photoViewer.C3 = false;
                        photoViewer.f34230b0.invalidate();
                        photoViewer.f34388s3 = 4;
                        return;
                    }
                    photoViewer.f34388s3 = 4;
                    return;
                }
                return;
            case 7:
                ob0 ob0Var = (ob0) this.f16884c;
                if (!this.f16883b) {
                    org.telegram.ui.Cells.s8 s8Var = ob0Var.f39644n;
                    if (s8Var != null && s8Var.f23755e.h) {
                        int i15 = -ob0Var.K;
                        ob0Var.K = i15;
                        AndroidUtilities.shakeViewSpring(s8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                    boolean z20 = s8Var2.f23755e.h;
                    s8Var2.setChecked(!z20);
                    ob0Var.Z(z20);
                    org.telegram.ui.Cells.s8 s8Var3 = ob0Var.f39644n;
                    if (s8Var3 != null) {
                        if (s8Var2.f23755e.h) {
                            s8Var3.setChecked(false);
                            ob0Var.f39644n.setCheckBoxIcon(R.drawable.permission_locked);
                            ob0Var.f39645r.setVisibility(8);
                            return;
                        } else if (ob0Var.f39642e == null) {
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
                org.telegram.ui.ng0 ng0Var2 = (org.telegram.ui.ng0) this.f16884c;
                boolean z21 = this.f16883b;
                og0 og0Var = ng0Var2.S;
                if (og0Var.getParentActivity() != null) {
                    boolean z22 = true;
                    boolean z23 = !og0Var.B;
                    og0Var.B = z23;
                    ((org.telegram.ui.Cells.z1) view).c(z23, true);
                    if (((z21 && og0Var.getConnectionsManager().isTestBackend()) ? false : false) != og0Var.B) {
                        og0Var.getConnectionsManager().switchBackend(false);
                    }
                    ng0Var2.s();
                    return;
                }
                return;
        }
    }
}
