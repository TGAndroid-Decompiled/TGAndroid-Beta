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
public final class rn5 implements DialogInterface.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public rn5(Object obj, Object obj2, Object obj3, byte b) {
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
                wn5 wn5Var = (wn5) obj3;
                Runnable runnable = (Runnable) obj;
                int intValue = ((Integer) ((ArrayList) obj2).get(i)).intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue == 4 && (dVar = wn5Var.a) != null && dVar.getParentActivity() != null) {
                                    try {
                                        if (wn5Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                            wn5Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                            return;
                                        }
                                        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                        File s0 = gm.s0(false);
                                        if (s0 != null) {
                                            if (Build.VERSION.SDK_INT >= 24) {
                                                Activity parentActivity = wn5Var.a.getParentActivity();
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
                                            wn5Var.f = s0.getAbsolutePath();
                                        }
                                        wn5Var.a.startActivityForResult(intent, 15);
                                        return;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            }
                            runnable.run();
                            return;
                        }
                        wn5Var.q();
                        return;
                    }
                    wn5Var.m();
                    return;
                }
                wn5Var.l();
                return;
            default:
                d0 d0Var = (d0) obj3;
                amb ambVar = (amb) obj2;
                e0 e0Var = (e0) obj;
                ThemeActivity themeActivity = d0Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if (i == 0) {
                        if (i == 1) {
                            i2 = 2;
                        }
                        ik.T(themeActivity, i2, ambVar.b, ambVar);
                        return;
                    } else if (i == 1) {
                        if (ambVar.r == null) {
                            themeActivity.getMessagesController().D4(ambVar.b, ambVar);
                            nm7.e().k(274, ambVar.b, ambVar);
                            return;
                        }
                        String str = "https://" + themeActivity.getMessagesController().N2 + "/addtheme/" + ambVar.r.slug;
                        themeActivity.showDialog(new tca(themeActivity.getParentActivity(), null, str, false, str, false, null));
                        return;
                    } else if (i == 2) {
                        themeActivity.presentFragment(new zob(ambVar.b, ambVar, false));
                        return;
                    } else if (i == 3 && themeActivity.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        String M0 = jb6.M0(2131751421, "DeleteThemeTitle");
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131751422, "DeleteThemeAlert");
                        alertDialog$Builder.j(jb6.M0(2131751535, "Delete"), new jq9(d0Var, e0Var, ambVar, (byte) 8));
                        alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                        themeActivity.showDialog(heVar);
                        TextView textView = (TextView) heVar.c(-1);
                        if (textView != null) {
                            anb.X(textView, cmb.p7, null);
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
