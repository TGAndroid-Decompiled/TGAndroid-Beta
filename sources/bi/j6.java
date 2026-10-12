package bi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ks;
public final class j6 extends ks {
    public final k6 f3203c;

    public j6(k6 k6Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f3203c = k6Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        k6 k6Var = this.f3203c;
        w6 w6Var = k6Var.f3244x;
        v6 v6Var = w6Var.E;
        if (v6Var != null && v6Var.f3862f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.menu_views_reposts;
        } else if (w6Var.O.f3077a) {
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
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, w6Var.f3906s);
        if (!w6Var.O.f3077a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final j6 f3172b;

            {
                this.f3172b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w6 w6Var2 = this.f3172b.f3203c.f3244x;
                        g6 g6Var = w6Var2.O;
                        if (!g6Var.f3077a) {
                            g6 g6Var2 = w6Var2.M;
                            if (g6Var2 != null) {
                                g6Var.f3077a = true;
                                g6Var2.f3077a = true;
                            } else {
                                g6Var.f3077a = true;
                            }
                            w6Var2.h(true);
                            w6.b(w6Var2);
                            w6Var2.N.run(w6Var2);
                        }
                        j6 j6Var = w6Var2.f3903f;
                        if (j6Var != null) {
                            j6Var.a();
                            return;
                        }
                        return;
                    default:
                        w6 w6Var3 = this.f3172b.f3203c.f3244x;
                        g6 g6Var3 = w6Var3.O;
                        if (g6Var3.f3077a) {
                            g6 g6Var4 = w6Var3.M;
                            if (g6Var4 != null) {
                                g6Var3.f3077a = false;
                                g6Var4.f3077a = false;
                            } else {
                                g6Var3.f3077a = false;
                            }
                            w6Var3.h(true);
                            w6.b(w6Var3);
                            w6Var3.N.run(w6Var3);
                        }
                        j6 j6Var2 = w6Var3.f3903f;
                        if (j6Var2 != null) {
                            j6Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!w6Var.O.f3077a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, w6Var.f3906s);
        if (w6Var.O.f3077a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final j6 f3172b;

            {
                this.f3172b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w6 w6Var2 = this.f3172b.f3203c.f3244x;
                        g6 g6Var = w6Var2.O;
                        if (!g6Var.f3077a) {
                            g6 g6Var2 = w6Var2.M;
                            if (g6Var2 != null) {
                                g6Var.f3077a = true;
                                g6Var2.f3077a = true;
                            } else {
                                g6Var.f3077a = true;
                            }
                            w6Var2.h(true);
                            w6.b(w6Var2);
                            w6Var2.N.run(w6Var2);
                        }
                        j6 j6Var = w6Var2.f3903f;
                        if (j6Var != null) {
                            j6Var.a();
                            return;
                        }
                        return;
                    default:
                        w6 w6Var3 = this.f3172b.f3203c.f3244x;
                        g6 g6Var3 = w6Var3.O;
                        if (g6Var3.f3077a) {
                            g6 g6Var4 = w6Var3.M;
                            if (g6Var4 != null) {
                                g6Var3.f3077a = false;
                                g6Var4.f3077a = false;
                            } else {
                                g6Var3.f3077a = false;
                            }
                            w6Var3.h(true);
                            w6.b(w6Var3);
                            w6Var3.N.run(w6Var3);
                        }
                        j6 j6Var2 = w6Var3.f3903f;
                        if (j6Var2 != null) {
                            j6Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View j1Var = new org.telegram.ui.ActionBar.j1(k6Var.getContext(), org.telegram.ui.ActionBar.g6.H8, w6Var.f3906s);
        j1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.a6.n(-1, 8));
        if (z10) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        b bVar = w6Var.f3906s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20007j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.a6.n(-1, -2));
    }

    @Override
    public final void c() {
    }
}
