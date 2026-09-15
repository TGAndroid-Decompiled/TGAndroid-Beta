package ai;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.xr;
public final class x6 extends xr {
    public final y6 f1695c;

    public x6(y6 y6Var, Context context, d dVar) {
        super(context, dVar, false);
        this.f1695c = y6Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        y6 y6Var = this.f1695c;
        j7 j7Var = y6Var.f1756x;
        i7 i7Var = j7Var.E;
        if (i7Var != null && i7Var.f993f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.menu_views_reposts;
        } else if (j7Var.O.f1573a) {
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
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, j7Var.f1048s);
        if (!j7Var.O.f1573a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final x6 f1655b;

            {
                this.f1655b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j7 j7Var2 = this.f1655b.f1695c.f1756x;
                        u6 u6Var = j7Var2.O;
                        if (!u6Var.f1573a) {
                            u6 u6Var2 = j7Var2.M;
                            if (u6Var2 != null) {
                                u6Var.f1573a = true;
                                u6Var2.f1573a = true;
                            } else {
                                u6Var.f1573a = true;
                            }
                            j7Var2.h(true);
                            j7.b(j7Var2);
                            j7Var2.N.accept(j7Var2);
                        }
                        x6 x6Var = j7Var2.f1045f;
                        if (x6Var != null) {
                            x6Var.a();
                            return;
                        }
                        return;
                    default:
                        j7 j7Var3 = this.f1655b.f1695c.f1756x;
                        u6 u6Var3 = j7Var3.O;
                        if (u6Var3.f1573a) {
                            u6 u6Var4 = j7Var3.M;
                            if (u6Var4 != null) {
                                u6Var3.f1573a = false;
                                u6Var4.f1573a = false;
                            } else {
                                u6Var3.f1573a = false;
                            }
                            j7Var3.h(true);
                            j7.b(j7Var3);
                            j7Var3.N.accept(j7Var3);
                        }
                        x6 x6Var2 = j7Var3.f1045f;
                        if (x6Var2 != null) {
                            x6Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!j7Var.O.f1573a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, j7Var.f1048s);
        if (j7Var.O.f1573a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final x6 f1655b;

            {
                this.f1655b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        j7 j7Var2 = this.f1655b.f1695c.f1756x;
                        u6 u6Var = j7Var2.O;
                        if (!u6Var.f1573a) {
                            u6 u6Var2 = j7Var2.M;
                            if (u6Var2 != null) {
                                u6Var.f1573a = true;
                                u6Var2.f1573a = true;
                            } else {
                                u6Var.f1573a = true;
                            }
                            j7Var2.h(true);
                            j7.b(j7Var2);
                            j7Var2.N.accept(j7Var2);
                        }
                        x6 x6Var = j7Var2.f1045f;
                        if (x6Var != null) {
                            x6Var.a();
                            return;
                        }
                        return;
                    default:
                        j7 j7Var3 = this.f1655b.f1695c.f1756x;
                        u6 u6Var3 = j7Var3.O;
                        if (u6Var3.f1573a) {
                            u6 u6Var4 = j7Var3.M;
                            if (u6Var4 != null) {
                                u6Var3.f1573a = false;
                                u6Var4.f1573a = false;
                            } else {
                                u6Var3.f1573a = false;
                            }
                            j7Var3.h(true);
                            j7.b(j7Var3);
                            j7Var3.N.accept(j7Var3);
                        }
                        x6 x6Var2 = j7Var3.f1045f;
                        if (x6Var2 != null) {
                            x6Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View k1Var = new org.telegram.ui.ActionBar.k1(y6Var.getContext(), org.telegram.ui.ActionBar.i6.H8, j7Var.f1048s);
        k1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.x5.n(-1, 8));
        if (z10) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        d dVar = j7Var.f1048s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18943j5, dVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.x5.n(-1, -2));
    }

    @Override
    public final void c() {
    }
}
