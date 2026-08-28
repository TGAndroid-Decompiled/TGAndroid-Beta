package mh;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.LaunchActivity;
public final class i0 extends eb {
    public final b6 f17894a;
    public final g0 f17895b;
    public final h0 f17896c;
    public final TextView d;
    public final TextView f17897e;
    public j0 f17898f;
    public int h;

    public i0(Context context, b6 b6Var) {
        super(context, b6Var);
        this.h = 0;
        this.f17894a = b6Var;
        g0 g0Var = new g0(AndroidUtilities.dp(10.0f));
        g0Var.f17848a.setColor(f6.v0(f6.Fi, b6Var));
        this.f17895b = g0Var;
        setBackground(g0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        h0 h0Var = new h0(context, imageView);
        this.f17896c = h0Var;
        imageView.setImageDrawable(h0Var);
        addView(imageView, e6.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, e6.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i9 = f6.Hi;
        textView.setTextColor(f6.v0(i9, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = j3.r0.h(linearLayout, textView, e6.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f17897e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(f6.v0(i9, b6Var));
        linearLayout.addView(h, e6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i9) {
        if (this.h != i9) {
            this.h = i9;
            if (i9 == 0) {
                setButton((db) null);
                return;
            }
            b6 b6Var = this.f17894a;
            if (i9 == 1) {
                ec ecVar = new ec(getContext(), b6Var, true);
                ecVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                ecVar.f27999a = new Runnable(this) {
                    public final i0 f17828b;

                    {
                        this.f17828b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                i0 i0Var = this.f17828b;
                                gc bulletin = i0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f28737j = 2750;
                                    bulletin.i(true);
                                }
                                j0 j0Var = i0Var.f17898f;
                                if (j0Var != null) {
                                    j0Var.a();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var2 = this.f17828b;
                                gc bulletin2 = i0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                j0 j0Var2 = i0Var2.f17898f;
                                if (j0Var2 != null && (file = j0Var2.d) != null && file.exists()) {
                                    File file2 = j0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ecVar.f28001c = getBulletin();
                }
                setButton(ecVar);
            } else if (i9 == 2) {
                ec ecVar2 = new ec(getContext(), b6Var, true);
                ecVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                ecVar2.f27999a = new Runnable(this) {
                    public final i0 f17828b;

                    {
                        this.f17828b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                i0 i0Var = this.f17828b;
                                gc bulletin = i0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f28737j = 2750;
                                    bulletin.i(true);
                                }
                                j0 j0Var = i0Var.f17898f;
                                if (j0Var != null) {
                                    j0Var.a();
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var2 = this.f17828b;
                                gc bulletin2 = i0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                j0 j0Var2 = i0Var2.f17898f;
                                if (j0Var2 != null && (file = j0Var2.d) != null && file.exists()) {
                                    File file2 = j0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ecVar2.f28001c = getBulletin();
                }
                setButton(ecVar2);
            }
        }
    }

    public final boolean c(j0 j0Var) {
        boolean z10;
        j0 j0Var2 = this.f17898f;
        h0 h0Var = this.f17896c;
        if (j0Var2 != j0Var) {
            y5 y5Var = h0Var.f17875k;
            h0Var.h = false;
            y5Var.getClass();
            y5Var.d(0.0f, true);
            mi0 mi0Var = h0Var.f17876l;
            if (mi0Var != null) {
                mi0Var.A(true);
                h0Var.f17876l = null;
            }
            y5 y5Var2 = h0Var.f17873i;
            h0Var.f17871f = false;
            y5Var2.getClass();
            y5Var2.d(0.0f, true);
        }
        this.f17898f = j0Var;
        this.d.setText(j0Var.f17916c);
        boolean c10 = j0Var.c();
        TextView textView = this.f17897e;
        if (c10) {
            Pair b10 = j0Var.b();
            h0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            h0Var.f17871f = z10;
            if (z10) {
                h0Var.f17872g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
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
        } else if (j0Var.f17920i) {
            gc bulletin = getBulletin();
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
                    mi0 mi0Var2 = new mi0(R.raw.contact_check, AndroidUtilities.dp(40.0f), "contact_check", AndroidUtilities.dp(40.0f));
                    h0Var.f17876l = mi0Var2;
                    mi0Var2.f30863r0 = h0Var.f17867a;
                    mi0Var2.H(true);
                    h0Var.f17876l.start();
                    h0Var.f17872g = 1.0f;
                }
                gc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f28737j = 5000;
                    bulletin2.i(true);
                }
            }
            return false;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), 1073741824));
    }

    public void setArrow(int i9) {
        boolean z10;
        g0 g0Var = this.f17895b;
        g0Var.getClass();
        if (i9 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0Var.f17851e = z10;
        if (z10) {
            g0Var.f17852f = i9;
        }
        g0Var.invalidateSelf();
    }
}
