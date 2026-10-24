package gi;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.LaunchActivity;
import w7.z5;
public final class h0 extends lb {
    public final g6 f11255a;
    public final f0 f11256b;
    public final g0 f11257c;
    public final TextView d;
    public final TextView e;
    public i0 f11258f;
    public int h;

    public h0(Context context, g6 g6Var) {
        super(context, g6Var);
        this.h = 0;
        this.f11255a = g6Var;
        f0 f0Var = new f0(AndroidUtilities.dp(10.0f));
        f0Var.f11215a.setColor(k6.w0(k6.Fi, g6Var));
        this.f11256b = f0Var;
        setBackground(f0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        g0 g0Var = new g0(context, imageView);
        this.f11257c = g0Var;
        imageView.setImageDrawable(g0Var);
        addView(imageView, z5.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = k6.Hi;
        r6.W(textView, i10, g6Var);
        textView.setTypeface(AndroidUtilities.bold());
        TextView f7 = tl.f(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = f7;
        f7.setTextSize(1, 13.0f);
        r6.W(f7, i10, g6Var);
        linearLayout.addView(f7, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((kb) null);
                return;
            }
            g6 g6Var = this.f11255a;
            if (i10 == 1) {
                mc mcVar = new mc(getContext(), g6Var, true);
                mcVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                mcVar.f28574b = new Runnable(this) {
                    public final h0 f11194b;

                    {
                        this.f11194b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                h0 h0Var = this.f11194b;
                                oc bulletin = h0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f29203j = 2750;
                                    bulletin.i(true);
                                }
                                i0 i0Var = h0Var.f11258f;
                                if (i0Var != null) {
                                    i0Var.a();
                                    return;
                                }
                                return;
                            default:
                                h0 h0Var2 = this.f11194b;
                                oc bulletin2 = h0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                i0 i0Var2 = h0Var2.f11258f;
                                if (i0Var2 != null && (file = i0Var2.d) != null && file.exists()) {
                                    File file2 = i0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.I1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    mcVar.d = getBulletin();
                }
                setButton(mcVar);
            } else if (i10 == 2) {
                mc mcVar2 = new mc(getContext(), g6Var, true);
                mcVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                mcVar2.f28574b = new Runnable(this) {
                    public final h0 f11194b;

                    {
                        this.f11194b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                h0 h0Var = this.f11194b;
                                oc bulletin = h0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f29203j = 2750;
                                    bulletin.i(true);
                                }
                                i0 i0Var = h0Var.f11258f;
                                if (i0Var != null) {
                                    i0Var.a();
                                    return;
                                }
                                return;
                            default:
                                h0 h0Var2 = this.f11194b;
                                oc bulletin2 = h0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                i0 i0Var2 = h0Var2.f11258f;
                                if (i0Var2 != null && (file = i0Var2.d) != null && file.exists()) {
                                    File file2 = i0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.I1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    mcVar2.d = getBulletin();
                }
                setButton(mcVar2);
            }
        }
    }

    public final boolean c(i0 i0Var) {
        boolean z10;
        i0 i0Var2 = this.f11258f;
        g0 g0Var = this.f11257c;
        if (i0Var2 != i0Var) {
            d6 d6Var = g0Var.f11243k;
            g0Var.h = false;
            d6Var.getClass();
            d6Var.d(0.0f, true);
            xj0 xj0Var = g0Var.f11244l;
            if (xj0Var != null) {
                xj0Var.C(true);
                g0Var.f11244l = null;
            }
            d6 d6Var2 = g0Var.f11241i;
            g0Var.f11239f = false;
            d6Var2.getClass();
            d6Var2.d(0.0f, true);
        }
        this.f11258f = i0Var;
        this.d.setText(i0Var.f11274c);
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
            g0Var.f11239f = z10;
            if (z10) {
                g0Var.f11240g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
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
        } else if (i0Var.f11277i) {
            oc bulletin = getBulletin();
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
                    xj0 xj0Var2 = new xj0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    g0Var.f11244l = xj0Var2;
                    xj0Var2.R(g0Var.f11236a);
                    g0Var.f11244l.J(true);
                    g0Var.f11244l.start();
                    g0Var.f11240g = 1.0f;
                }
                oc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f29203j = 5000;
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
        f0 f0Var = this.f11256b;
        f0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f0Var.e = z10;
        if (z10) {
            f0Var.f11218f = i10;
        }
        f0Var.invalidateSelf();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        f0 f0Var = this.f11256b;
        if (f0Var != null) {
            try {
                f0Var.f11215a.setColor(k6.w0(k6.Fi, this.f11255a));
                f0Var.invalidateSelf();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
