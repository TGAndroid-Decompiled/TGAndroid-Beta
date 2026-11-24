package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;
import org.telegram.ui.e0;
public final class rl5 implements DialogInterface.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public rl5(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        d dVar;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        int i2 = 1;
        switch (b) {
            case 0:
                wl5 wl5Var = (wl5) obj3;
                Runnable runnable = (Runnable) obj;
                int intValue = ((Integer) ((ArrayList) obj2).get(i)).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue == 4 && (dVar = wl5Var.a) != null && dVar.getParentActivity() != null) {
                                    try {
                                        if (wl5Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                            wl5Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                            return;
                                        }
                                        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                        File s0 = gl.s0(false);
                                        if (s0 != null) {
                                            if (Build.VERSION.SDK_INT >= 24) {
                                                Activity parentActivity = wl5Var.a.getParentActivity();
                                                a.d();
                                                intent.putExtra("output", FileProvider.c(parentActivity, "org.telegram.messenger.beta.provider", s0));
                                                intent.addFlags(2);
                                                intent.addFlags(1);
                                            } else {
                                                intent.putExtra("output", Uri.fromFile(s0));
                                            }
                                            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                                            intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                                            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                                            intent.putExtra("android.intent.extra.durationLimit", 10);
                                            wl5Var.f = s0.getAbsolutePath();
                                        }
                                        wl5Var.a.startActivityForResult(intent, 15);
                                        return;
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            }
                            runnable.run();
                            return;
                        }
                        wl5Var.q();
                        return;
                    }
                    wl5Var.m();
                    return;
                }
                wl5Var.l();
                return;
            default:
                d0 d0Var = (d0) obj3;
                zjb zjbVar = (zjb) obj2;
                e0 e0Var = (e0) obj;
                ThemeActivity themeActivity = d0Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if (i == 0) {
                        if (i == 1) {
                            i2 = 2;
                        }
                        ij.T(themeActivity, i2, zjbVar.b, zjbVar);
                        return;
                    } else if (i == 1) {
                        if (zjbVar.r == null) {
                            themeActivity.getMessagesController().A4(zjbVar.b, zjbVar);
                            kk7.e().k(272, zjbVar.b, zjbVar);
                            return;
                        }
                        String str = "https://" + themeActivity.getMessagesController().N2 + "/addtheme/" + zjbVar.r.slug;
                        themeActivity.showDialog(new taa(themeActivity.getParentActivity(), null, str, false, str, false, null));
                        return;
                    } else if (i == 2) {
                        themeActivity.presentFragment(new ymb(zjbVar.b, zjbVar, false));
                        return;
                    } else if (i == 3 && themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        String M0 = k96.M0(2131751472, "DeleteThemeTitle");
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131751473, "DeleteThemeAlert");
                        alertDialog$Builder.j(k96.M0(2131751586, "Delete"), new io9(d0Var, e0Var, zjbVar, (byte) 8));
                        alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                        themeActivity.showDialog(hdVar);
                        TextView textView = (TextView) hdVar.c(-1);
                        if (textView != null) {
                            zkb.X(textView, bkb.p7, null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
