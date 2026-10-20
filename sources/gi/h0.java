package gi;

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
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.LaunchActivity;
import w7.z5;
public final class h0 extends nb {
    public final d6 f11233a;
    public final f0 f11234b;
    public final g0 f11235c;
    public final TextView d;
    public final TextView e;
    public i0 f11236f;
    public int h;

    public h0(Context context, d6 d6Var) {
        super(context, d6Var);
        this.h = 0;
        this.f11233a = d6Var;
        f0 f0Var = new f0(AndroidUtilities.dp(10.0f));
        f0Var.f11193a.setColor(h6.w0(h6.Fi, d6Var));
        this.f11234b = f0Var;
        setBackground(f0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        g0 g0Var = new g0(context, imageView);
        this.f11235c = g0Var;
        imageView.setImageDrawable(g0Var);
        addView(imageView, z5.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = h6.Hi;
        textView.setTextColor(h6.w0(i10, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = i11;
        i11.setTextSize(1, 13.0f);
        i11.setTextColor(h6.w0(i10, d6Var));
        linearLayout.addView(i11, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((mb) null);
                return;
            }
            d6 d6Var = this.f11233a;
            if (i10 == 1) {
                oc ocVar = new oc(getContext(), d6Var, true);
                ocVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                ocVar.f28982a = new Runnable(this) {
                    public final h0 f11172b;

                    {
                        this.f11172b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                h0 h0Var = this.f11172b;
                                qc bulletin = h0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f29530j = 2750;
                                    bulletin.i(true);
                                }
                                i0 i0Var = h0Var.f11236f;
                                if (i0Var != null) {
                                    i0Var.a();
                                    return;
                                }
                                return;
                            default:
                                h0 h0Var2 = this.f11172b;
                                qc bulletin2 = h0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                i0 i0Var2 = h0Var2.f11236f;
                                if (i0Var2 != null && (file = i0Var2.d) != null && file.exists()) {
                                    File file2 = i0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ocVar.f28984c = getBulletin();
                }
                setButton(ocVar);
            } else if (i10 == 2) {
                oc ocVar2 = new oc(getContext(), d6Var, true);
                ocVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                ocVar2.f28982a = new Runnable(this) {
                    public final h0 f11172b;

                    {
                        this.f11172b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                h0 h0Var = this.f11172b;
                                qc bulletin = h0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f29530j = 2750;
                                    bulletin.i(true);
                                }
                                i0 i0Var = h0Var.f11236f;
                                if (i0Var != null) {
                                    i0Var.a();
                                    return;
                                }
                                return;
                            default:
                                h0 h0Var2 = this.f11172b;
                                qc bulletin2 = h0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                i0 i0Var2 = h0Var2.f11236f;
                                if (i0Var2 != null && (file = i0Var2.d) != null && file.exists()) {
                                    File file2 = i0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ocVar2.f28984c = getBulletin();
                }
                setButton(ocVar2);
            }
        }
    }

    public final boolean c(i0 i0Var) {
        boolean z10;
        i0 i0Var2 = this.f11236f;
        g0 g0Var = this.f11235c;
        if (i0Var2 != i0Var) {
            f6 f6Var = g0Var.f11221k;
            g0Var.h = false;
            f6Var.getClass();
            f6Var.d(0.0f, true);
            vj0 vj0Var = g0Var.f11222l;
            if (vj0Var != null) {
                vj0Var.C(true);
                g0Var.f11222l = null;
            }
            f6 f6Var2 = g0Var.f11219i;
            g0Var.f11217f = false;
            f6Var2.getClass();
            f6Var2.d(0.0f, true);
        }
        this.f11236f = i0Var;
        this.d.setText(i0Var.f11252c);
        boolean c10 = i0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = i0Var.b();
            g0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0Var.f11217f = z10;
            if (z10) {
                g0Var.f11218g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            g0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloading));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
            } else {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
            }
            setButton(1);
            return false;
        } else if (i0Var.f11255i) {
            qc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (i0Var.h) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
                setButton(2);
                if (!g0Var.h) {
                    g0Var.h = true;
                    vj0 vj0Var2 = new vj0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    g0Var.f11222l = vj0Var2;
                    vj0Var2.R(g0Var.f11214a);
                    g0Var.f11222l.J(true);
                    g0Var.f11222l.start();
                    g0Var.f11218g = 1.0f;
                }
                qc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f29530j = 5000;
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
        f0 f0Var = this.f11234b;
        f0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0Var.e = z10;
        if (z10) {
            f0Var.f11196f = i10;
        }
        f0Var.invalidateSelf();
    }
}
