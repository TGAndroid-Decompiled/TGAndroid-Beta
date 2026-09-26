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
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import w7.y5;
public final class j0 extends nb {
    public final d6 f8383a;
    public final h0 f8384b;
    public final i0 f8385c;
    public final TextView d;
    public final TextView e;
    public k0 f8386f;
    public int h;

    public j0(Context context, d6 d6Var) {
        super(context, d6Var);
        this.h = 0;
        this.f8383a = d6Var;
        h0 h0Var = new h0(AndroidUtilities.dp(10.0f));
        h0Var.f8351a.setColor(h6.v0(h6.Fi, d6Var));
        this.f8384b = h0Var;
        setBackground(h0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        i0 i0Var = new i0(context, imageView);
        this.f8385c = i0Var;
        imageView.setImageDrawable(i0Var);
        addView(imageView, y5.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, y5.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = h6.Hi;
        textView.setTextColor(h6.v0(i10, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, y5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(h6.v0(i10, d6Var));
        linearLayout.addView(h, y5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((mb) null);
                return;
            }
            d6 d6Var = this.f8383a;
            if (i10 == 1) {
                oc ocVar = new oc(getContext(), d6Var, true);
                ocVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                ocVar.f27021a = new Runnable(this) {
                    public final j0 f8338b;

                    {
                        this.f8338b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                j0 j0Var = this.f8338b;
                                qc bulletin = j0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f27577j = 2750;
                                    bulletin.i(true);
                                }
                                k0 k0Var = j0Var.f8386f;
                                if (k0Var != null) {
                                    k0Var.a();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var2 = this.f8338b;
                                qc bulletin2 = j0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                k0 k0Var2 = j0Var2.f8386f;
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
                    ocVar.f27023c = getBulletin();
                }
                setButton(ocVar);
            } else if (i10 == 2) {
                oc ocVar2 = new oc(getContext(), d6Var, true);
                ocVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                ocVar2.f27021a = new Runnable(this) {
                    public final j0 f8338b;

                    {
                        this.f8338b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                j0 j0Var = this.f8338b;
                                qc bulletin = j0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f27577j = 2750;
                                    bulletin.i(true);
                                }
                                k0 k0Var = j0Var.f8386f;
                                if (k0Var != null) {
                                    k0Var.a();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var2 = this.f8338b;
                                qc bulletin2 = j0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                k0 k0Var2 = j0Var2.f8386f;
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
                    ocVar2.f27023c = getBulletin();
                }
                setButton(ocVar2);
            }
        }
    }

    public final boolean c(k0 k0Var) {
        boolean z10;
        k0 k0Var2 = this.f8386f;
        i0 i0Var = this.f8385c;
        if (k0Var2 != k0Var) {
            e6 e6Var = i0Var.f8374k;
            i0Var.h = false;
            e6Var.getClass();
            e6Var.d(0.0f, true);
            ij0 ij0Var = i0Var.f8375l;
            if (ij0Var != null) {
                ij0Var.C(true);
                i0Var.f8375l = null;
            }
            e6 e6Var2 = i0Var.f8372i;
            i0Var.f8370f = false;
            e6Var2.getClass();
            e6Var2.d(0.0f, true);
        }
        this.f8386f = k0Var;
        this.d.setText(k0Var.f8398c);
        boolean c10 = k0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = k0Var.b();
            i0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i0Var.f8370f = z10;
            if (z10) {
                i0Var.f8371g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
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
        } else if (k0Var.f8401i) {
            qc bulletin = getBulletin();
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
                    ij0 ij0Var2 = new ij0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    i0Var.f8375l = ij0Var2;
                    ij0Var2.R(i0Var.f8367a);
                    i0Var.f8375l.J(true);
                    i0Var.f8375l.start();
                    i0Var.f8371g = 1.0f;
                }
                qc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f27577j = 5000;
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
        h0 h0Var = this.f8384b;
        h0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0Var.e = z10;
        if (z10) {
            h0Var.f8354f = i10;
        }
        h0Var.invalidateSelf();
    }
}
