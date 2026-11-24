package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.LanguageSelectActivity;
public final class iz5 extends q59 {
    public final byte c;
    public final Context d;
    public final boolean e;
    public final d f;

    public iz5(d dVar, Context context, boolean z, byte b) {
        this.c = b;
        this.f = dVar;
        this.d = context;
        this.e = z;
    }

    @Override
    public final boolean D(u69 u69Var) {
        switch (this.c) {
            case 0:
                int i = u69Var.f;
                if (i != 0 && i != 4 && i != 5 && i != 2) {
                    return false;
                }
                return true;
            default:
                if (u69Var.f != 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int b() {
        int i;
        int i2;
        byte b = this.c;
        int i3 = 1;
        d dVar = this.f;
        boolean z = this.e;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) dVar;
                if (z) {
                    ArrayList arrayList = languageSelectActivity.e;
                    if (arrayList == null) {
                        return 0;
                    }
                    return arrayList.size();
                }
                if (!languageSelectActivity.getMessagesController().J2() && !languageSelectActivity.getMessagesController().I2()) {
                    i2 = 1;
                } else {
                    if (languageSelectActivity.getMessagesController().J2()) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    if (languageSelectActivity.getMessagesController().I2() && !languageSelectActivity.getMessagesController().H3()) {
                        i++;
                    }
                    if (languageSelectActivity.f0() || languageSelectActivity.g0()) {
                        i++;
                    }
                    i2 = i + 1;
                }
                int size = languageSelectActivity.f.size() + i2 + 1;
                if (!languageSelectActivity.h.isEmpty()) {
                    return size + languageSelectActivity.h.size() + 1;
                }
                return size;
            default:
                qc9 qc9Var = (qc9) dVar;
                if (z) {
                    ArrayList arrayList2 = qc9Var.f;
                    if (arrayList2 == null) {
                        return 0;
                    }
                    return arrayList2.size();
                }
                if (qc9Var.e < 0) {
                    i3 = 0;
                }
                return qc9Var.h.size() + i3;
        }
    }

    @Override
    public final int d(int i) {
        int i2;
        byte b = this.c;
        d dVar = this.f;
        boolean z = this.e;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) dVar;
                if (!z) {
                    if (!languageSelectActivity.getMessagesController().J2() && !languageSelectActivity.getMessagesController().I2()) {
                        i2 = i;
                    } else {
                        int i3 = i - 1;
                        if (i != 0) {
                            if (!languageSelectActivity.getMessagesController().J2()) {
                                languageSelectActivity.manualTranslationPosition = -1;
                            } else {
                                int i4 = i - 2;
                                if (i3 == 0) {
                                    languageSelectActivity.manualTranslationPosition = i;
                                    return 2;
                                }
                                i3 = i4;
                            }
                            if (!languageSelectActivity.getMessagesController().I2() || languageSelectActivity.getMessagesController().H3()) {
                                languageSelectActivity.autoTranslationPosition = -1;
                            } else {
                                int i5 = i3 - 1;
                                if (i3 == 0) {
                                    languageSelectActivity.autoTranslationPosition = i;
                                    return 2;
                                }
                                i3 = i5;
                            }
                            if (languageSelectActivity.f0() || languageSelectActivity.g0()) {
                                languageSelectActivity.doNotTranslatePosition = i;
                                int i6 = i3 - 1;
                                if (i3 == 0) {
                                    return 4;
                                }
                                i3 = i6;
                            }
                            i2 = i3 - 1;
                            if (i3 == 0) {
                                languageSelectActivity.n = i;
                                return 6;
                            }
                        }
                        return 3;
                    }
                    int i7 = i2 - 1;
                    if (i2 != 0) {
                        if (!languageSelectActivity.h.isEmpty()) {
                            if (i7 == languageSelectActivity.h.size()) {
                                return 1;
                            }
                            if (i7 == languageSelectActivity.f.size() + languageSelectActivity.h.size() + 1) {
                                return 1;
                            }
                        }
                        if (languageSelectActivity.h.isEmpty() && i7 == languageSelectActivity.f.size()) {
                            return 1;
                        }
                        languageSelectActivity.r = i - i7;
                    }
                    return 3;
                }
                return 0;
            default:
                if (!z && i == ((qc9) dVar).e) {
                    return 1;
                }
                return 0;
        }
    }

    @Override
    public final void t(defpackage.u69 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz5.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        float f3;
        float f4;
        bba bbaVar;
        jf5 jf5Var;
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                int i6 = 5;
                if (i != 0) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4 && i != 5) {
                                if (i != 6) {
                                    bbaVar = new bba(context, (hg9) null);
                                } else {
                                    bbaVar = new njb(context);
                                }
                            } else {
                                bbaVar = new vkb(context);
                            }
                        } else {
                            bbaVar = new jf5(context);
                        }
                    } else {
                        bbaVar = new bjb(context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.e = 50;
                    frameLayout.n = (byte) 21;
                    TextView textView = new TextView(context);
                    frameLayout.a = textView;
                    anb.X(textView, cmb.F6, null);
                    wi8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (jb6.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    textView.setGravity(i2 | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z = jb6.a0;
                    if (z) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    int i7 = i3 | 48;
                    if (z) {
                        f = 21.0f;
                    } else {
                        f = 64.0f;
                    }
                    if (z) {
                        f2 = 64.0f;
                    } else {
                        f2 = 21.0f;
                    }
                    frameLayout.addView(textView, qoe.d(-1, -1.0f, i7, f, 0.0f, f2, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.b = textView2;
                    anb.X(textView2, cmb.y6, null);
                    textView2.setTextSize(1, 13.0f);
                    if (jb6.a0) {
                        i4 = 5;
                    } else {
                        i4 = 3;
                    }
                    textView2.setGravity(i4);
                    textView2.setLines(1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setPadding(0, 0, 0, 0);
                    textView2.setEllipsize(truncateAt);
                    boolean z2 = jb6.a0;
                    if (z2) {
                        i5 = 5;
                    } else {
                        i5 = 3;
                    }
                    int i8 = i5 | 48;
                    if (z2) {
                        f3 = 21.0f;
                    } else {
                        f3 = 64.0f;
                    }
                    if (z2) {
                        f4 = 64.0f;
                    } else {
                        f4 = 21.0f;
                    }
                    frameLayout.addView(textView2, qoe.d(-2, -2.0f, i8, f3, 36.0f, f4, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout.c = radioButton;
                    radioButton.setSize(gm.L(20.0f));
                    anb.O(radioButton, cmb.f7, cmb.g7, null);
                    if (!jb6.a0) {
                        i6 = 3;
                    }
                    frameLayout.addView(radioButton, qoe.d(20, 20.0f, i6 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    frameLayout.h = jb6.a0;
                    frameLayout.setClipChildren(false);
                    bbaVar = frameLayout;
                }
                return new u69(bbaVar);
            default:
                if (i != 0) {
                    if (i != 2) {
                        jf5Var = new bba(context, (hg9) null);
                    } else {
                        jf5 jf5Var2 = new jf5(context);
                        jf5Var2.setText(jb6.M0(2131752061, null));
                        jf5Var = jf5Var2;
                    }
                } else {
                    jf5Var = new cjb(context);
                }
                return new u69(jf5Var);
        }
    }

    @Override
    public final void y(u69 u69Var) {
        switch (this.c) {
            case 0:
                View view = u69Var.a;
                if (view instanceof akb) {
                    ((akb) view).c();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
