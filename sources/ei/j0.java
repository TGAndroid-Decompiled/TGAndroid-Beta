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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import w7.x5;
public final class j0 extends qb {
    public final e6 f9122a;
    public final h0 f9123b;
    public final i0 f9124c;
    public final TextView d;
    public final TextView f9125e;
    public k0 f9126f;
    public int h;

    public j0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.h = 0;
        this.f9122a = e6Var;
        h0 h0Var = new h0(AndroidUtilities.dp(10.0f));
        h0Var.f9086a.setColor(i6.w0(i6.Fi, e6Var));
        this.f9123b = h0Var;
        setBackground(h0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        i0 i0Var = new i0(context, imageView);
        this.f9124c = i0Var;
        imageView.setImageDrawable(i0Var);
        addView(imageView, x5.a(40.0f, 7.0f, 0.0f, 0.0f, 0.0f, 40, 23));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.a(-2.0f, 54.0f, 0.0f, 0.0f, 0.0f, -1, 23));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = i6.Hi;
        textView.setTextColor(i6.w0(i10, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f9125e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(i6.w0(i10, e6Var));
        linearLayout.addView(h, x5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((pb) null);
                return;
            }
            e6 e6Var = this.f9122a;
            if (i10 == 1) {
                rc rcVar = new rc(getContext(), e6Var, true);
                rcVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                rcVar.f30443a = new Runnable(this) {
                    public final j0 f9072b;

                    {
                        this.f9072b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                j0 j0Var = this.f9072b;
                                tc bulletin = j0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f31096j = 2750;
                                    bulletin.i(true);
                                }
                                k0 k0Var = j0Var.f9126f;
                                if (k0Var != null) {
                                    k0Var.a();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var2 = this.f9072b;
                                tc bulletin2 = j0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                k0 k0Var2 = j0Var2.f9126f;
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
                    rcVar.f30445c = getBulletin();
                }
                setButton(rcVar);
            } else if (i10 == 2) {
                rc rcVar2 = new rc(getContext(), e6Var, true);
                rcVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                rcVar2.f30443a = new Runnable(this) {
                    public final j0 f9072b;

                    {
                        this.f9072b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                j0 j0Var = this.f9072b;
                                tc bulletin = j0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f31096j = 2750;
                                    bulletin.i(true);
                                }
                                k0 k0Var = j0Var.f9126f;
                                if (k0Var != null) {
                                    k0Var.a();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var2 = this.f9072b;
                                tc bulletin2 = j0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                k0 k0Var2 = j0Var2.f9126f;
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
                    rcVar2.f30445c = getBulletin();
                }
                setButton(rcVar2);
            }
        }
    }

    public final boolean c(k0 k0Var) {
        boolean z10;
        k0 k0Var2 = this.f9126f;
        i0 i0Var = this.f9124c;
        if (k0Var2 != k0Var) {
            g6 g6Var = i0Var.f9113k;
            i0Var.h = false;
            g6Var.getClass();
            g6Var.d(0.0f, true);
            dk0 dk0Var = i0Var.f9114l;
            if (dk0Var != null) {
                dk0Var.C(true);
                i0Var.f9114l = null;
            }
            g6 g6Var2 = i0Var.f9111i;
            i0Var.f9109f = false;
            g6Var2.getClass();
            g6Var2.d(0.0f, true);
        }
        this.f9126f = k0Var;
        this.d.setText(k0Var.f9141c);
        boolean c10 = k0Var.c();
        TextView textView = this.f9125e;
        if (c10) {
            Pair b10 = k0Var.b();
            i0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i0Var.f9109f = z10;
            if (z10) {
                i0Var.f9110g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
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
        } else if (k0Var.f9145i) {
            tc bulletin = getBulletin();
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
                    dk0 dk0Var2 = new dk0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    i0Var.f9114l = dk0Var2;
                    dk0Var2.R(i0Var.f9105a);
                    i0Var.f9114l.J(true);
                    i0Var.f9114l.start();
                    i0Var.f9110g = 1.0f;
                }
                tc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f31096j = 5000;
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
        h0 h0Var = this.f9123b;
        h0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0Var.f9089e = z10;
        if (z10) {
            h0Var.f9090f = i10;
        }
        h0Var.invalidateSelf();
    }
}
