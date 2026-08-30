package nh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.vr;
public final class s4 extends vr {
    public final t4 f15878c;

    public s4(t4 t4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f15878c = t4Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        t4 t4Var = this.f15878c;
        d5 d5Var = t4Var.f15913x;
        c5 c5Var = d5Var.B;
        if (c5Var != null && c5Var.f15149f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i10 = R.drawable.menu_views_reposts;
        } else if (d5Var.L.f15746a) {
            i10 = R.drawable.menu_views_reactions2;
        } else {
            i10 = R.drawable.menu_views_reactions;
        }
        int i14 = i10;
        if (z4) {
            i11 = R.string.SortByReposts;
        } else {
            i11 = R.string.SortByReactions;
        }
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, d5Var.f15271s);
        if (!d5Var.L.f15746a) {
            c3.setAlpha(0.5f);
        }
        c3.setOnClickListener(new View.OnClickListener(this) {
            public final s4 f15839b;

            {
                this.f15839b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d5 d5Var2 = this.f15839b.f15878c.f15913x;
                        p4 p4Var = d5Var2.L;
                        if (!p4Var.f15746a) {
                            p4 p4Var2 = d5Var2.J;
                            if (p4Var2 != null) {
                                p4Var.f15746a = true;
                                p4Var2.f15746a = true;
                            } else {
                                p4Var.f15746a = true;
                            }
                            d5Var2.h(true);
                            d5.b(d5Var2);
                            d5Var2.K.accept(d5Var2);
                        }
                        s4 s4Var = d5Var2.f15268f;
                        if (s4Var != null) {
                            s4Var.a();
                            return;
                        }
                        return;
                    default:
                        d5 d5Var3 = this.f15839b.f15878c.f15913x;
                        p4 p4Var3 = d5Var3.L;
                        if (p4Var3.f15746a) {
                            p4 p4Var4 = d5Var3.J;
                            if (p4Var4 != null) {
                                p4Var3.f15746a = false;
                                p4Var4.f15746a = false;
                            } else {
                                p4Var3.f15746a = false;
                            }
                            d5Var3.h(true);
                            d5.b(d5Var3);
                            d5Var3.K.accept(d5Var3);
                        }
                        s4 s4Var2 = d5Var3.f15268f;
                        if (s4Var2 != null) {
                            s4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!d5Var.L.f15746a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, d5Var.f15271s);
        if (d5Var.L.f15746a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final s4 f15839b;

            {
                this.f15839b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d5 d5Var2 = this.f15839b.f15878c.f15913x;
                        p4 p4Var = d5Var2.L;
                        if (!p4Var.f15746a) {
                            p4 p4Var2 = d5Var2.J;
                            if (p4Var2 != null) {
                                p4Var.f15746a = true;
                                p4Var2.f15746a = true;
                            } else {
                                p4Var.f15746a = true;
                            }
                            d5Var2.h(true);
                            d5.b(d5Var2);
                            d5Var2.K.accept(d5Var2);
                        }
                        s4 s4Var = d5Var2.f15268f;
                        if (s4Var != null) {
                            s4Var.a();
                            return;
                        }
                        return;
                    default:
                        d5 d5Var3 = this.f15839b.f15878c.f15913x;
                        p4 p4Var3 = d5Var3.L;
                        if (p4Var3.f15746a) {
                            p4 p4Var4 = d5Var3.J;
                            if (p4Var4 != null) {
                                p4Var3.f15746a = false;
                                p4Var4.f15746a = false;
                            } else {
                                p4Var3.f15746a = false;
                            }
                            d5Var3.h(true);
                            d5.b(d5Var3);
                            d5Var3.K.accept(d5Var3);
                        }
                        s4 s4Var2 = d5Var3.f15268f;
                        if (s4Var2 != null) {
                            s4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View m1Var = new org.telegram.ui.ActionBar.m1(t4Var.getContext(), org.telegram.ui.ActionBar.j6.H8, d5Var.f15271s);
        m1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var, k7.b6.n(-1, 8));
        if (z4) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        b bVar = d5Var.f15271s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20012j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, k7.b6.n(-1, -2));
    }

    @Override
    public final void c() {
    }
}
