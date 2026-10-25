package di;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.js;
public final class h5 extends js {
    public final i5 f8627c;

    public h5(i5 i5Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f8627c = i5Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        i5 i5Var = this.f8627c;
        t5 t5Var = i5Var.f8680x;
        s5 s5Var = t5Var.E;
        if (s5Var != null && s5Var.f9159f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.menu_views_reposts;
        } else if (t5Var.O.f8519a) {
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
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, t5Var.f9197s);
        if (!t5Var.O.f8519a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final h5 f8580b;

            {
                this.f8580b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f8580b.f8627c.f8680x;
                        e5 e5Var = t5Var2.O;
                        if (!e5Var.f8519a) {
                            e5 e5Var2 = t5Var2.M;
                            if (e5Var2 != null) {
                                e5Var.f8519a = true;
                                e5Var2.f8519a = true;
                            } else {
                                e5Var.f8519a = true;
                            }
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            t5Var2.N.run(t5Var2);
                        }
                        h5 h5Var = t5Var2.f9194f;
                        if (h5Var != null) {
                            h5Var.a();
                            return;
                        }
                        return;
                    default:
                        t5 t5Var3 = this.f8580b.f8627c.f8680x;
                        e5 e5Var3 = t5Var3.O;
                        if (e5Var3.f8519a) {
                            e5 e5Var4 = t5Var3.M;
                            if (e5Var4 != null) {
                                e5Var3.f8519a = false;
                                e5Var4.f8519a = false;
                            } else {
                                e5Var3.f8519a = false;
                            }
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            t5Var3.N.run(t5Var3);
                        }
                        h5 h5Var2 = t5Var3.f9194f;
                        if (h5Var2 != null) {
                            h5Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!t5Var.O.f8519a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, t5Var.f9197s);
        if (t5Var.O.f8519a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final h5 f8580b;

            {
                this.f8580b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f8580b.f8627c.f8680x;
                        e5 e5Var = t5Var2.O;
                        if (!e5Var.f8519a) {
                            e5 e5Var2 = t5Var2.M;
                            if (e5Var2 != null) {
                                e5Var.f8519a = true;
                                e5Var2.f8519a = true;
                            } else {
                                e5Var.f8519a = true;
                            }
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            t5Var2.N.run(t5Var2);
                        }
                        h5 h5Var = t5Var2.f9194f;
                        if (h5Var != null) {
                            h5Var.a();
                            return;
                        }
                        return;
                    default:
                        t5 t5Var3 = this.f8580b.f8627c.f8680x;
                        e5 e5Var3 = t5Var3.O;
                        if (e5Var3.f8519a) {
                            e5 e5Var4 = t5Var3.M;
                            if (e5Var4 != null) {
                                e5Var3.f8519a = false;
                                e5Var4.f8519a = false;
                            } else {
                                e5Var3.f8519a = false;
                            }
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            t5Var3.N.run(t5Var3);
                        }
                        h5 h5Var2 = t5Var3.f9194f;
                        if (h5Var2 != null) {
                            h5Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View l1Var = new org.telegram.ui.ActionBar.l1(i5Var.getContext(), org.telegram.ui.ActionBar.y6.H8, t5Var.f9197s);
        l1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, gb1.r(-1, 8));
        if (z10) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        b bVar = t5Var.f9197s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, bVar);
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, gb1.r(-1, -2));
    }

    @Override
    public final void c() {
    }
}
