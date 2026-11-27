package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ProfileActivity;
public final class s20 implements DialogInterface.OnClickListener {
    public final byte a;
    public final Object b;

    public s20(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        f30 f30Var;
        String str;
        byte b = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                kp9 kp9Var = (kp9) obj;
                kp9Var.getClass();
                k44 k44Var = phd.c;
                if (i == 0) {
                    f30Var = f30.a;
                } else {
                    f30Var = f30.b;
                }
                k44Var.b(f30Var);
                ((t20) kp9Var.c).g(2);
                return;
            case 1:
                uj3 uj3Var = (uj3) obj;
                if (i == 0) {
                    kf7 messagesStorage = uj3Var.getMessagesStorage();
                    messagesStorage.a.c(new bd7(messagesStorage, 1, (byte) 2));
                    return;
                } else if (i != 1 || uj3Var.f0 == null) {
                    return;
                } else {
                    while (true) {
                        tj3[] tj3VarArr = uj3Var.f0;
                        if (i2 < tj3VarArr.length) {
                            tj3 tj3Var = tj3VarArr[i2];
                            if (tj3Var.s == 0 && tj3Var.getVisibility() == 0) {
                                of3 n3 = uj3.n3(uj3Var.f0[i2]);
                                qj3 qj3Var = uj3Var.f0[i2].a;
                                int i3 = qj3.C3;
                                qj3Var.D1(true, n3);
                            }
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 2:
                ph6 ph6Var = (ph6) obj;
                if (i == 0) {
                    f11.a = !f11.a;
                    a.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", f11.a).commit();
                    d31 b0 = d31.b0(ph6Var.h0);
                    if (f11.a) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    b0.Q(2131623982, 36, str).j();
                    if (f11.a) {
                        ik8.q(a.s, new StringBuilder("app start time = "));
                        try {
                            cc4.b("buildVersion = " + a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.m3(ph6Var.h0.getParentActivity(), false);
                return;
            case 3:
                b18 b18Var = (b18) obj;
                if (i == 0) {
                    b18Var.x = "male";
                    b18Var.Z[4].setText(ob6.M0(2131747235, null));
                    return;
                } else if (i == 1) {
                    b18Var.x = "female";
                    b18Var.Z[4].setText(ob6.M0(2131747296, null));
                    return;
                } else {
                    return;
                }
            case 4:
                ((VoIPService) obj).lambda$toggleSpeakerphoneOrShowRouteSheet$90(dialogInterface, i);
                return;
            default:
                am2 am2Var = (am2) obj;
                qvc qvcVar = (qvc) am2Var.e;
                Activity activity = (Activity) am2Var.c;
                try {
                    if (i == 0) {
                        try {
                            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                            File q0 = hl.q0(null, false);
                            if (q0 != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    a.d();
                                    intent.putExtra("output", FileProvider.c(activity, "org.telegram.messenger.beta.provider", q0));
                                    intent.addFlags(2);
                                    intent.addFlags(1);
                                } else {
                                    intent.putExtra("output", Uri.fromFile(q0));
                                }
                                am2Var.b = q0.getAbsolutePath();
                            }
                            activity.startActivityForResult(intent, 10);
                            return;
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            return;
                        }
                    } else if (i == 1) {
                        am2Var.J();
                        return;
                    } else if (i == 2) {
                        qvcVar.a();
                        return;
                    } else if (i == 3) {
                        qvcVar.b(null, null, false);
                        return;
                    } else {
                        return;
                    }
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
        }
    }
}
