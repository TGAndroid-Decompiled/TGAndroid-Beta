package hi;

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
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
public final class o0 extends nb {
    public final u6 f13165a;
    public final m0 f13166b;
    public final n0 f13167c;
    public final TextView d;
    public final TextView e;
    public p0 f13168f;
    public int h;

    public o0(Context context, u6 u6Var) {
        super(context, u6Var);
        this.h = 0;
        this.f13165a = u6Var;
        m0 m0Var = new m0(AndroidUtilities.dp(10.0f));
        m0Var.f13091a.setColor(y6.w0(y6.Fi, u6Var));
        this.f13166b = m0Var;
        setBackground(m0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        n0 n0Var = new n0(context, imageView);
        this.f13167c = n0Var;
        imageView.setImageDrawable(n0Var);
        addView(imageView, kb1.h(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.h(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = y6.Hi;
        f7.V(textView, i10, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        TextView e = wh.e(linearLayout, textView, kb1.x(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = e;
        e.setTextSize(1, 13.0f);
        f7.V(e, i10, u6Var);
        linearLayout.addView(e, kb1.x(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((mb) null);
                return;
            }
            u6 u6Var = this.f13165a;
            if (i10 == 1) {
                oc ocVar = new oc(getContext(), u6Var, true);
                ocVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                ocVar.f31259b = new Runnable(this) {
                    public final o0 f13076b;

                    {
                        this.f13076b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                o0 o0Var = this.f13076b;
                                qc bulletin = o0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f31861j = 2750;
                                    bulletin.i(true);
                                }
                                p0 p0Var = o0Var.f13168f;
                                if (p0Var != null) {
                                    p0Var.a();
                                    return;
                                }
                                return;
                            default:
                                o0 o0Var2 = this.f13076b;
                                qc bulletin2 = o0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                p0 p0Var2 = o0Var2.f13168f;
                                if (p0Var2 != null && (file = p0Var2.d) != null && file.exists()) {
                                    File file2 = p0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.I1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ocVar.d = getBulletin();
                }
                setButton(ocVar);
            } else if (i10 == 2) {
                oc ocVar2 = new oc(getContext(), u6Var, true);
                ocVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                ocVar2.f31259b = new Runnable(this) {
                    public final o0 f13076b;

                    {
                        this.f13076b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                o0 o0Var = this.f13076b;
                                qc bulletin = o0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f31861j = 2750;
                                    bulletin.i(true);
                                }
                                p0 p0Var = o0Var.f13168f;
                                if (p0Var != null) {
                                    p0Var.a();
                                    return;
                                }
                                return;
                            default:
                                o0 o0Var2 = this.f13076b;
                                qc bulletin2 = o0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                p0 p0Var2 = o0Var2.f13168f;
                                if (p0Var2 != null && (file = p0Var2.d) != null && file.exists()) {
                                    File file2 = p0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.I1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ocVar2.d = getBulletin();
                }
                setButton(ocVar2);
            }
        }
    }

    public final boolean c(p0 p0Var) {
        boolean z10;
        p0 p0Var2 = this.f13168f;
        n0 n0Var = this.f13167c;
        if (p0Var2 != p0Var) {
            h6 h6Var = n0Var.f13144k;
            n0Var.h = false;
            h6Var.getClass();
            h6Var.d(0.0f, true);
            yj0 yj0Var = n0Var.f13145l;
            if (yj0Var != null) {
                yj0Var.C(true);
                n0Var.f13145l = null;
            }
            h6 h6Var2 = n0Var.f13142i;
            n0Var.f13140f = false;
            h6Var2.getClass();
            h6Var2.d(0.0f, true);
        }
        this.f13168f = p0Var;
        this.d.setText(p0Var.f13190c);
        boolean c10 = p0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = p0Var.b();
            n0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            n0Var.f13140f = z10;
            if (z10) {
                n0Var.f13141g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            n0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloading));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
            } else {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
            }
            setButton(1);
            return false;
        } else if (p0Var.f13193i) {
            qc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (p0Var.h) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
                setButton(2);
                if (!n0Var.h) {
                    n0Var.h = true;
                    yj0 yj0Var2 = new yj0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    n0Var.f13145l = yj0Var2;
                    yj0Var2.R(n0Var.f13137a);
                    n0Var.f13145l.J(true);
                    n0Var.f13145l.start();
                    n0Var.f13141g = 1.0f;
                }
                qc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f31861j = 5000;
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
        m0 m0Var = this.f13166b;
        m0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        m0Var.e = z10;
        if (z10) {
            m0Var.f13094f = i10;
        }
        m0Var.invalidateSelf();
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        m0 m0Var = this.f13166b;
        if (m0Var != null) {
            try {
                m0Var.f13091a.setColor(y6.w0(y6.Fi, this.f13165a));
                m0Var.invalidateSelf();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
