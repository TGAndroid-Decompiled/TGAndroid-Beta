package di;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.LaunchActivity;
import w7.a6;
public final class m0 extends mb {
    public final f6 f6756a;
    public final k0 f6757b;
    public final l0 f6758c;
    public final TextView d;
    public final TextView e;
    public n0 f6759f;
    public int h;

    public m0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.h = 0;
        this.f6756a = f6Var;
        k0 k0Var = new k0(AndroidUtilities.dp(10.0f));
        k0Var.f6720a.setColor(j6.v0(j6.Fi, f6Var));
        this.f6757b = k0Var;
        setBackground(k0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        l0 l0Var = new l0(context, imageView);
        this.f6758c = l0Var;
        imageView.setImageDrawable(l0Var);
        addView(imageView, a6.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, a6.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = j6.Hi;
        textView.setTextColor(j6.v0(i10, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, a6.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = g10;
        g10.setTextSize(1, 13.0f);
        g10.setTextColor(j6.v0(i10, f6Var));
        linearLayout.addView(g10, a6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((lb) null);
                return;
            }
            f6 f6Var = this.f6756a;
            if (i10 == 1) {
                nc ncVar = new nc(getContext(), f6Var, true);
                ncVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                ncVar.f25483a = new Runnable(this) {
                    public final m0 f6692b;

                    {
                        this.f6692b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                m0 m0Var = this.f6692b;
                                pc bulletin = m0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f26081j = 2750;
                                    bulletin.i(true);
                                }
                                n0 n0Var = m0Var.f6759f;
                                if (n0Var != null) {
                                    n0Var.a();
                                    return;
                                }
                                return;
                            default:
                                m0 m0Var2 = this.f6692b;
                                pc bulletin2 = m0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                n0 n0Var2 = m0Var2.f6759f;
                                if (n0Var2 != null && (file = n0Var2.d) != null && file.exists()) {
                                    File file2 = n0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ncVar.f25485c = getBulletin();
                }
                setButton(ncVar);
            } else if (i10 == 2) {
                nc ncVar2 = new nc(getContext(), f6Var, true);
                ncVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                ncVar2.f25483a = new Runnable(this) {
                    public final m0 f6692b;

                    {
                        this.f6692b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                m0 m0Var = this.f6692b;
                                pc bulletin = m0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f26081j = 2750;
                                    bulletin.i(true);
                                }
                                n0 n0Var = m0Var.f6759f;
                                if (n0Var != null) {
                                    n0Var.a();
                                    return;
                                }
                                return;
                            default:
                                m0 m0Var2 = this.f6692b;
                                pc bulletin2 = m0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                n0 n0Var2 = m0Var2.f6759f;
                                if (n0Var2 != null && (file = n0Var2.d) != null && file.exists()) {
                                    File file2 = n0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ncVar2.f25485c = getBulletin();
                }
                setButton(ncVar2);
            }
        }
    }

    public final boolean c(n0 n0Var) {
        boolean z10;
        n0 n0Var2 = this.f6759f;
        l0 l0Var = this.f6758c;
        if (n0Var2 != n0Var) {
            d6 d6Var = l0Var.f6743k;
            l0Var.h = false;
            d6Var.getClass();
            d6Var.d(0.0f, true);
            hj0 hj0Var = l0Var.f6744l;
            if (hj0Var != null) {
                hj0Var.C(true);
                l0Var.f6744l = null;
            }
            d6 d6Var2 = l0Var.f6741i;
            l0Var.f6739f = false;
            d6Var2.getClass();
            d6Var2.d(0.0f, true);
        }
        this.f6759f = n0Var;
        this.d.setText(n0Var.f6772c);
        boolean c10 = n0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = n0Var.b();
            l0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            l0Var.f6739f = z10;
            if (z10) {
                l0Var.f6740g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            l0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloading));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
            } else {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
            }
            setButton(1);
            return false;
        } else if (n0Var.f6775i) {
            pc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (n0Var.h) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
                setButton(2);
                if (!l0Var.h) {
                    l0Var.h = true;
                    hj0 hj0Var2 = new hj0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    l0Var.f6744l = hj0Var2;
                    hj0Var2.f23672v0 = l0Var.f6736a;
                    hj0Var2.J(true);
                    l0Var.f6744l.start();
                    l0Var.f6740g = 1.0f;
                }
                pc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f26081j = 5000;
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
        k0 k0Var = this.f6757b;
        k0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k0Var.e = z10;
        if (z10) {
            k0Var.f6723f = i10;
        }
        k0Var.invalidateSelf();
    }
}
