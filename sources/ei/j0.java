package ei;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.LaunchActivity;
import w7.x5;
public final class j0 extends pb {
    public final d6 f9121a;
    public final h0 f9122b;
    public final i0 f9123c;
    public final TextView d;
    public final TextView f9124e;
    public k0 f9125f;
    public int h;

    public j0(Context context, d6 d6Var) {
        super(context, d6Var);
        this.h = 0;
        this.f9121a = d6Var;
        h0 h0Var = new h0(AndroidUtilities.dp(10.0f));
        h0Var.f9085a.setColor(h6.w0(h6.Fi, d6Var));
        this.f9122b = h0Var;
        setBackground(h0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        i0 i0Var = new i0(context, imageView);
        this.f9123c = i0Var;
        imageView.setImageDrawable(i0Var);
        addView(imageView, x5.a(40.0f, 7.0f, 0.0f, 0.0f, 0.0f, 40, 23));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.a(-2.0f, 54.0f, 0.0f, 0.0f, 0.0f, -1, 23));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = h6.Hi;
        textView.setTextColor(h6.w0(i10, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f9124e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(h6.w0(i10, d6Var));
        linearLayout.addView(h, x5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((ob) null);
                return;
            }
            d6 d6Var = this.f9121a;
            if (i10 == 1) {
                qc qcVar = new qc(getContext(), d6Var, true);
                qcVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                qcVar.f30123a = new Runnable(this) {
                    public final j0 f9071b;

                    {
                        this.f9071b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                j0 j0Var = this.f9071b;
                                sc bulletin = j0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f30711j = 2750;
                                    bulletin.i(true);
                                }
                                k0 k0Var = j0Var.f9125f;
                                if (k0Var != null) {
                                    k0Var.a();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var2 = this.f9071b;
                                sc bulletin2 = j0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                k0 k0Var2 = j0Var2.f9125f;
                                if (k0Var2 != null && (file = k0Var2.d) != null && file.exists()) {
                                    File file2 = k0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    qcVar.f30125c = getBulletin();
                }
                setButton(qcVar);
            } else if (i10 == 2) {
                qc qcVar2 = new qc(getContext(), d6Var, true);
                qcVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                qcVar2.f30123a = new Runnable(this) {
                    public final j0 f9071b;

                    {
                        this.f9071b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                j0 j0Var = this.f9071b;
                                sc bulletin = j0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f30711j = 2750;
                                    bulletin.i(true);
                                }
                                k0 k0Var = j0Var.f9125f;
                                if (k0Var != null) {
                                    k0Var.a();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var2 = this.f9071b;
                                sc bulletin2 = j0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                k0 k0Var2 = j0Var2.f9125f;
                                if (k0Var2 != null && (file = k0Var2.d) != null && file.exists()) {
                                    File file2 = k0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    qcVar2.f30125c = getBulletin();
                }
                setButton(qcVar2);
            }
        }
    }

    public final boolean c(k0 k0Var) {
        boolean z10;
        k0 k0Var2 = this.f9125f;
        i0 i0Var = this.f9123c;
        if (k0Var2 != k0Var) {
            g6 g6Var = i0Var.f9112k;
            i0Var.h = false;
            g6Var.getClass();
            g6Var.d(0.0f, true);
            ek0 ek0Var = i0Var.f9113l;
            if (ek0Var != null) {
                ek0Var.C(true);
                i0Var.f9113l = null;
            }
            g6 g6Var2 = i0Var.f9110i;
            i0Var.f9108f = false;
            g6Var2.getClass();
            g6Var2.d(0.0f, true);
        }
        this.f9125f = k0Var;
        this.d.setText(k0Var.f9140c);
        boolean c10 = k0Var.c();
        TextView textView = this.f9124e;
        if (c10) {
            Pair b10 = k0Var.b();
            i0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i0Var.f9108f = z10;
            if (z10) {
                i0Var.f9109g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            i0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloading));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
            } else {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
            }
            setButton(1);
            return false;
        } else if (k0Var.f9144i) {
            sc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (k0Var.h) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
                setButton(2);
                if (!i0Var.h) {
                    i0Var.h = true;
                    ek0 ek0Var2 = new ek0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    i0Var.f9113l = ek0Var2;
                    ek0Var2.R(i0Var.f9104a);
                    i0Var.f9113l.J(true);
                    i0Var.f9113l.start();
                    i0Var.f9109g = 1.0f;
                }
                sc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f30711j = 5000;
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
        h0 h0Var = this.f9122b;
        h0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0Var.f9088e = z10;
        if (z10) {
            h0Var.f9089f = i10;
        }
        h0Var.invalidateSelf();
    }
}
