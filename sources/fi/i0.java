package fi;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import w7.z5;
public final class i0 extends pb {
    public final c6 f9318a;
    public final g0 f9319b;
    public final h0 f9320c;
    public final TextView d;
    public final TextView e;
    public j0 f9321f;
    public int h;

    public i0(Context context, c6 c6Var) {
        super(context, c6Var);
        this.h = 0;
        this.f9318a = c6Var;
        g0 g0Var = new g0(AndroidUtilities.dp(10.0f));
        g0Var.f9283a.setColor(g6.w0(g6.Fi, c6Var));
        this.f9319b = g0Var;
        setBackground(g0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        h0 h0Var = new h0(context, imageView);
        this.f9320c = h0Var;
        imageView.setImageDrawable(h0Var);
        addView(imageView, z5.a(40.0f, 7.0f, 0.0f, 0.0f, 0.0f, 40, 23));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.a(-2.0f, 54.0f, 0.0f, 0.0f, 0.0f, -1, 23));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = g6.Hi;
        textView.setTextColor(g6.w0(i10, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = i11;
        i11.setTextSize(1, 13.0f);
        i11.setTextColor(g6.w0(i10, c6Var));
        linearLayout.addView(i11, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((ob) null);
                return;
            }
            c6 c6Var = this.f9318a;
            if (i10 == 1) {
                qc qcVar = new qc(getContext(), c6Var, true);
                qcVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                qcVar.f28266a = new Runnable(this) {
                    public final i0 f9271b;

                    {
                        this.f9271b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                i0 i0Var = this.f9271b;
                                sc bulletin = i0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f28805j = 2750;
                                    bulletin.i(true);
                                }
                                j0 j0Var = i0Var.f9321f;
                                if (j0Var != null) {
                                    j0Var.a();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var2 = this.f9271b;
                                sc bulletin2 = i0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                j0 j0Var2 = i0Var2.f9321f;
                                if (j0Var2 != null && (file = j0Var2.d) != null && file.exists()) {
                                    File file2 = j0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    qcVar.f28268c = getBulletin();
                }
                setButton(qcVar);
            } else if (i10 == 2) {
                qc qcVar2 = new qc(getContext(), c6Var, true);
                qcVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                qcVar2.f28266a = new Runnable(this) {
                    public final i0 f9271b;

                    {
                        this.f9271b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                i0 i0Var = this.f9271b;
                                sc bulletin = i0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f28805j = 2750;
                                    bulletin.i(true);
                                }
                                j0 j0Var = i0Var.f9321f;
                                if (j0Var != null) {
                                    j0Var.a();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var2 = this.f9271b;
                                sc bulletin2 = i0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                j0 j0Var2 = i0Var2.f9321f;
                                if (j0Var2 != null && (file = j0Var2.d) != null && file.exists()) {
                                    File file2 = j0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    qcVar2.f28268c = getBulletin();
                }
                setButton(qcVar2);
            }
        }
    }

    public final boolean c(j0 j0Var) {
        boolean z10;
        j0 j0Var2 = this.f9321f;
        h0 h0Var = this.f9320c;
        if (j0Var2 != j0Var) {
            org.telegram.ui.Components.g6 g6Var = h0Var.f9305k;
            h0Var.h = false;
            g6Var.getClass();
            g6Var.d(0.0f, true);
            yj0 yj0Var = h0Var.f9306l;
            if (yj0Var != null) {
                yj0Var.C(true);
                h0Var.f9306l = null;
            }
            org.telegram.ui.Components.g6 g6Var2 = h0Var.f9303i;
            h0Var.f9301f = false;
            g6Var2.getClass();
            g6Var2.d(0.0f, true);
        }
        this.f9321f = j0Var;
        this.d.setText(j0Var.f9329c);
        boolean c10 = j0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = j0Var.b();
            h0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h0Var.f9301f = z10;
            if (z10) {
                h0Var.f9302g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            h0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloading));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
            } else {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
            }
            setButton(1);
            return false;
        } else if (j0Var.f9332i) {
            sc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (j0Var.h) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
                setButton(2);
                if (!h0Var.h) {
                    h0Var.h = true;
                    yj0 yj0Var2 = new yj0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    h0Var.f9306l = yj0Var2;
                    yj0Var2.R(h0Var.f9298a);
                    h0Var.f9306l.J(true);
                    h0Var.f9306l.start();
                    h0Var.f9302g = 1.0f;
                }
                sc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f28805j = 5000;
                    bulletin2.i(true);
                }
            }
            return false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), 1073741824));
    }

    public void setArrow(int i10) {
        boolean z10;
        g0 g0Var = this.f9319b;
        g0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0Var.e = z10;
        if (z10) {
            g0Var.f9286f = i10;
        }
        g0Var.invalidateSelf();
    }
}
