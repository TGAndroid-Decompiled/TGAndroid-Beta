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
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import w7.x5;
public final class j0 extends lb {
    public final e6 f8396a;
    public final h0 f8397b;
    public final i0 f8398c;
    public final TextView d;
    public final TextView e;
    public k0 f8399f;
    public int h;

    public j0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.h = 0;
        this.f8396a = e6Var;
        h0 h0Var = new h0(AndroidUtilities.dp(10.0f));
        h0Var.f8364a.setColor(i6.v0(i6.Fi, e6Var));
        this.f8397b = h0Var;
        setBackground(h0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        i0 i0Var = new i0(context, imageView);
        this.f8398c = i0Var;
        imageView.setImageDrawable(i0Var);
        addView(imageView, x5.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = i6.Hi;
        textView.setTextColor(i6.v0(i10, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(i6.v0(i10, e6Var));
        linearLayout.addView(h, x5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((kb) null);
                return;
            }
            e6 e6Var = this.f8396a;
            if (i10 == 1) {
                mc mcVar = new mc(getContext(), e6Var, true);
                mcVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                mcVar.f26137a = new Runnable(this) {
                    public final j0 f8351b;

                    {
                        this.f8351b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                j0 j0Var = this.f8351b;
                                oc bulletin = j0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f26754j = 2750;
                                    bulletin.i(true);
                                }
                                k0 k0Var = j0Var.f8399f;
                                if (k0Var != null) {
                                    k0Var.a();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var2 = this.f8351b;
                                oc bulletin2 = j0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                k0 k0Var2 = j0Var2.f8399f;
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
                    mcVar.f26139c = getBulletin();
                }
                setButton(mcVar);
            } else if (i10 == 2) {
                mc mcVar2 = new mc(getContext(), e6Var, true);
                mcVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                mcVar2.f26137a = new Runnable(this) {
                    public final j0 f8351b;

                    {
                        this.f8351b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                j0 j0Var = this.f8351b;
                                oc bulletin = j0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f26754j = 2750;
                                    bulletin.i(true);
                                }
                                k0 k0Var = j0Var.f8399f;
                                if (k0Var != null) {
                                    k0Var.a();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var2 = this.f8351b;
                                oc bulletin2 = j0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                k0 k0Var2 = j0Var2.f8399f;
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
                    mcVar2.f26139c = getBulletin();
                }
                setButton(mcVar2);
            }
        }
    }

    public final boolean c(k0 k0Var) {
        boolean z10;
        k0 k0Var2 = this.f8399f;
        i0 i0Var = this.f8398c;
        if (k0Var2 != k0Var) {
            c6 c6Var = i0Var.f8387k;
            i0Var.h = false;
            c6Var.getClass();
            c6Var.d(0.0f, true);
            xi0 xi0Var = i0Var.f8388l;
            if (xi0Var != null) {
                xi0Var.C(true);
                i0Var.f8388l = null;
            }
            c6 c6Var2 = i0Var.f8385i;
            i0Var.f8383f = false;
            c6Var2.getClass();
            c6Var2.d(0.0f, true);
        }
        this.f8399f = k0Var;
        this.d.setText(k0Var.f8411c);
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
            i0Var.f8383f = z10;
            if (z10) {
                i0Var.f8384g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
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
        } else if (k0Var.f8414i) {
            oc bulletin = getBulletin();
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
                    xi0 xi0Var2 = new xi0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    i0Var.f8388l = xi0Var2;
                    xi0Var2.f29972v0 = i0Var.f8380a;
                    xi0Var2.J(true);
                    i0Var.f8388l.start();
                    i0Var.f8384g = 1.0f;
                }
                oc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f26754j = 5000;
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
        h0 h0Var = this.f8397b;
        h0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0Var.e = z10;
        if (z10) {
            h0Var.f8367f = i10;
        }
        h0Var.invalidateSelf();
    }
}
