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
public final class ix5 extends n39 {
    public final byte c;
    public final Context d;
    public final boolean e;
    public final d f;

    public ix5(d dVar, Context context, boolean z, byte b) {
        this.c = b;
        this.f = dVar;
        this.d = context;
        this.e = z;
    }

    @Override
    public final boolean D(s49 s49Var) {
        switch (this.c) {
            case 0:
                int i = s49Var.f;
                if (i != 0 && i != 4 && i != 5 && i != 2) {
                    return false;
                }
                return true;
            default:
                if (s49Var.f != 0) {
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
                if (!languageSelectActivity.getMessagesController().H2() && !languageSelectActivity.getMessagesController().G2()) {
                    i2 = 1;
                } else {
                    if (languageSelectActivity.getMessagesController().H2()) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    if (languageSelectActivity.getMessagesController().G2() && !languageSelectActivity.getMessagesController().F3()) {
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
                qa9 qa9Var = (qa9) dVar;
                if (z) {
                    ArrayList arrayList2 = qa9Var.f;
                    if (arrayList2 == null) {
                        return 0;
                    }
                    return arrayList2.size();
                }
                if (qa9Var.e < 0) {
                    i3 = 0;
                }
                return qa9Var.h.size() + i3;
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
                    if (!languageSelectActivity.getMessagesController().H2() && !languageSelectActivity.getMessagesController().G2()) {
                        i2 = i;
                    } else {
                        int i3 = i - 1;
                        if (i != 0) {
                            if (!languageSelectActivity.getMessagesController().H2()) {
                                languageSelectActivity.manualTranslationPosition = -1;
                            } else {
                                int i4 = i - 2;
                                if (i3 == 0) {
                                    languageSelectActivity.manualTranslationPosition = i;
                                    return 2;
                                }
                                i3 = i4;
                            }
                            if (!languageSelectActivity.getMessagesController().G2() || languageSelectActivity.getMessagesController().F3()) {
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
                if (!z && i == ((qa9) dVar).e) {
                    return 1;
                }
                return 0;
        }
    }

    @Override
    public final void t(defpackage.s49 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix5.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        float f3;
        float f4;
        b9a b9aVar;
        ld5 ld5Var;
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
                                    b9aVar = new b9a(context, (de9) null);
                                } else {
                                    b9aVar = new mhb(context);
                                }
                            } else {
                                b9aVar = new uib(context);
                            }
                        } else {
                            b9aVar = new ld5(context);
                        }
                    } else {
                        b9aVar = new ahb(context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.e = 50;
                    frameLayout.n = (byte) 21;
                    TextView textView = new TextView(context);
                    frameLayout.a = textView;
                    zkb.X(textView, bkb.F6, null);
                    ug8.w(textView, 1, 16.0f, 1, 1);
                    textView.setSingleLine(true);
                    if (k96.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    textView.setGravity(i2 | 16);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    boolean z = k96.a0;
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
                    frameLayout.addView(textView, nme.d(-1, -1.0f, i7, f, 0.0f, f2, 0.0f));
                    TextView textView2 = new TextView(context);
                    frameLayout.b = textView2;
                    zkb.X(textView2, bkb.y6, null);
                    textView2.setTextSize(1, 13.0f);
                    if (k96.a0) {
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
                    boolean z2 = k96.a0;
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
                    frameLayout.addView(textView2, nme.d(-2, -2.0f, i8, f3, 36.0f, f4, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    frameLayout.c = radioButton;
                    radioButton.setSize(gl.L(20.0f));
                    zkb.O(radioButton, bkb.f7, bkb.g7, null);
                    if (!k96.a0) {
                        i6 = 3;
                    }
                    frameLayout.addView(radioButton, nme.d(20, 20.0f, i6 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                    frameLayout.h = k96.a0;
                    frameLayout.setClipChildren(false);
                    b9aVar = frameLayout;
                }
                return new s49(b9aVar);
            default:
                if (i != 0) {
                    if (i != 2) {
                        ld5Var = new b9a(context, (de9) null);
                    } else {
                        ld5 ld5Var2 = new ld5(context);
                        ld5Var2.setText(k96.M0(2131752112, null));
                        ld5Var = ld5Var2;
                    }
                } else {
                    ld5Var = new bhb(context);
                }
                return new s49(ld5Var);
        }
    }

    @Override
    public final void y(s49 s49Var) {
        switch (this.c) {
            case 0:
                View view = s49Var.a;
                if (view instanceof yhb) {
                    ((yhb) view).c();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
