package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.LanguageSelectActivity;
public final class nz5 extends c79 {
    public final byte c;
    public final Context d;
    public final boolean e;
    public final e f;

    public nz5(e eVar, Context context, boolean z, byte b) {
        this.c = b;
        this.f = eVar;
        this.d = context;
        this.e = z;
    }

    @Override
    public final boolean D(f89 f89Var) {
        switch (this.c) {
            case 0:
                int i = f89Var.f;
                if (i != 0 && i != 4 && i != 5 && i != 2) {
                    return false;
                }
                return true;
            default:
                if (f89Var.f != 0) {
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
        e eVar = this.f;
        boolean z = this.e;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) eVar;
                if (z) {
                    ArrayList arrayList = languageSelectActivity.e;
                    if (arrayList == null) {
                        return 0;
                    }
                    return arrayList.size();
                }
                if (!languageSelectActivity.getMessagesController().N2() && !languageSelectActivity.getMessagesController().M2()) {
                    i2 = 1;
                } else {
                    if (languageSelectActivity.getMessagesController().N2()) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    if (languageSelectActivity.getMessagesController().M2() && !languageSelectActivity.getMessagesController().M3()) {
                        i++;
                    }
                    if (languageSelectActivity.e0() || languageSelectActivity.f0()) {
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
                ee9 ee9Var = (ee9) eVar;
                if (z) {
                    ArrayList arrayList2 = ee9Var.f;
                    if (arrayList2 == null) {
                        return 0;
                    }
                    return arrayList2.size();
                }
                if (ee9Var.e < 0) {
                    i3 = 0;
                }
                return ee9Var.h.size() + i3;
        }
    }

    @Override
    public final int d(int i) {
        int i2;
        byte b = this.c;
        e eVar = this.f;
        boolean z = this.e;
        switch (b) {
            case 0:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) eVar;
                if (!z) {
                    if (!languageSelectActivity.getMessagesController().N2() && !languageSelectActivity.getMessagesController().M2()) {
                        i2 = i;
                    } else {
                        int i3 = i - 1;
                        if (i != 0) {
                            if (!languageSelectActivity.getMessagesController().N2()) {
                                languageSelectActivity.manualTranslationPosition = -1;
                            } else {
                                int i4 = i - 2;
                                if (i3 == 0) {
                                    languageSelectActivity.manualTranslationPosition = i;
                                    return 2;
                                }
                                i3 = i4;
                            }
                            if (!languageSelectActivity.getMessagesController().M2() || languageSelectActivity.getMessagesController().M3()) {
                                languageSelectActivity.autoTranslationPosition = -1;
                            } else {
                                int i5 = i3 - 1;
                                if (i3 == 0) {
                                    languageSelectActivity.autoTranslationPosition = i;
                                    return 2;
                                }
                                i3 = i5;
                            }
                            if (languageSelectActivity.e0() || languageSelectActivity.f0()) {
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
                if (!z && i == ((ee9) eVar).e) {
                    return 1;
                }
                return 0;
        }
    }

    @Override
    public final void t(defpackage.f89 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz5.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        float f3;
        float f4;
        rca rcaVar;
        mf5 mf5Var;
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
                                    rcaVar = new rca(context, (uh9) null);
                                } else {
                                    rcaVar = new ilb(context);
                                }
                            } else {
                                rcaVar = new qmb(context);
                            }
                        } else {
                            rcaVar = new mf5(context);
                        }
                    } else {
                        rcaVar = new wkb(context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.e = 50;
                    frameLayout.n = (byte) 21;
                    TextView textView = new TextView(context);
                    frameLayout.a = textView;
                    yob.X(textView, aob.G6, null);
                    ik8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (ob6.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    textView.setGravity(i2 | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z = ob6.a0;
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
                    frameLayout.addView(textView, tre.d(-1, -1.0f, i7, f, 0.0f, f2, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.b = textView2;
                    yob.X(textView2, aob.z6, null);
                    textView2.setTextSize(1, 13.0f);
                    if (ob6.a0) {
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
                    boolean z2 = ob6.a0;
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
                    frameLayout.addView(textView2, tre.d(-2, -2.0f, i8, f3, 36.0f, f4, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout.c = radioButton;
                    radioButton.setSize(hl.L(20.0f));
                    yob.O(radioButton, aob.g7, aob.h7, null);
                    if (!ob6.a0) {
                        i6 = 3;
                    }
                    frameLayout.addView(radioButton, tre.d(20, 20.0f, i6 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    frameLayout.h = ob6.a0;
                    frameLayout.setClipChildren(false);
                    rcaVar = frameLayout;
                }
                return new f89(rcaVar);
            default:
                if (i != 0) {
                    if (i != 2) {
                        mf5Var = new rca(context, (uh9) null);
                    } else {
                        mf5 mf5Var2 = new mf5(context);
                        mf5Var2.setText(ob6.M0(2131752089, null));
                        mf5Var = mf5Var2;
                    }
                } else {
                    mf5Var = new xkb(context);
                }
                return new f89(mf5Var);
        }
    }

    @Override
    public final void y(f89 f89Var) {
        switch (this.c) {
            case 0:
                View view = f89Var.a;
                if (view instanceof ulb) {
                    ((ulb) view).c();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
