package ai;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.as;
public final class x6 extends as {
    public final y6 f1701c;

    public x6(y6 y6Var, Context context, d dVar) {
        super(context, dVar, false);
        this.f1701c = y6Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        y6 y6Var = this.f1701c;
        k7 k7Var = y6Var.f1763x;
        j7 j7Var = k7Var.E;
        if (j7Var != null && j7Var.f1038f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.menu_views_reposts;
        } else if (k7Var.O.f1582a) {
            i10 = R.drawable.menu_views_reactions2;
        } else {
            i10 = R.drawable.menu_views_reactions;
        }
        int i14 = i10;
        if (z10) {
            i11 = R.string.SortByReposts;
        } else {
            i11 = R.string.SortByReactions;
        }
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, k7Var.f1136s);
        if (!k7Var.O.f1582a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final x6 f1662b;

            {
                this.f1662b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k7 k7Var2 = this.f1662b.f1701c.f1763x;
                        u6 u6Var = k7Var2.O;
                        if (!u6Var.f1582a) {
                            u6 u6Var2 = k7Var2.M;
                            if (u6Var2 != null) {
                                u6Var.f1582a = true;
                                u6Var2.f1582a = true;
                            } else {
                                u6Var.f1582a = true;
                            }
                            k7Var2.h(true);
                            k7.b(k7Var2);
                            k7Var2.N.run(k7Var2);
                        }
                        x6 x6Var = k7Var2.f1133f;
                        if (x6Var != null) {
                            x6Var.a();
                            return;
                        }
                        return;
                    default:
                        k7 k7Var3 = this.f1662b.f1701c.f1763x;
                        u6 u6Var3 = k7Var3.O;
                        if (u6Var3.f1582a) {
                            u6 u6Var4 = k7Var3.M;
                            if (u6Var4 != null) {
                                u6Var3.f1582a = false;
                                u6Var4.f1582a = false;
                            } else {
                                u6Var3.f1582a = false;
                            }
                            k7Var3.h(true);
                            k7.b(k7Var3);
                            k7Var3.N.run(k7Var3);
                        }
                        x6 x6Var2 = k7Var3.f1133f;
                        if (x6Var2 != null) {
                            x6Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!k7Var.O.f1582a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, k7Var.f1136s);
        if (k7Var.O.f1582a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final x6 f1662b;

            {
                this.f1662b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        k7 k7Var2 = this.f1662b.f1701c.f1763x;
                        u6 u6Var = k7Var2.O;
                        if (!u6Var.f1582a) {
                            u6 u6Var2 = k7Var2.M;
                            if (u6Var2 != null) {
                                u6Var.f1582a = true;
                                u6Var2.f1582a = true;
                            } else {
                                u6Var.f1582a = true;
                            }
                            k7Var2.h(true);
                            k7.b(k7Var2);
                            k7Var2.N.run(k7Var2);
                        }
                        x6 x6Var = k7Var2.f1133f;
                        if (x6Var != null) {
                            x6Var.a();
                            return;
                        }
                        return;
                    default:
                        k7 k7Var3 = this.f1662b.f1701c.f1763x;
                        u6 u6Var3 = k7Var3.O;
                        if (u6Var3.f1582a) {
                            u6 u6Var4 = k7Var3.M;
                            if (u6Var4 != null) {
                                u6Var3.f1582a = false;
                                u6Var4.f1582a = false;
                            } else {
                                u6Var3.f1582a = false;
                            }
                            k7Var3.h(true);
                            k7.b(k7Var3);
                            k7Var3.N.run(k7Var3);
                        }
                        x6 x6Var2 = k7Var3.f1133f;
                        if (x6Var2 != null) {
                            x6Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View j1Var = new org.telegram.ui.ActionBar.j1(y6Var.getContext(), org.telegram.ui.ActionBar.h6.H8, k7Var.f1136s);
        j1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.y5.n(-1, 8));
        if (z10) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        d dVar = k7Var.f1136s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19182j5, dVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.y5.n(-1, -2));
    }

    @Override
    public final void c() {
    }
}
