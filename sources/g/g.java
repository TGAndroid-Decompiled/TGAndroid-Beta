package g;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.common.api.internal.q1;
import java.util.WeakHashMap;
import m.w1;
import r0.c0;
import r0.j0;

public class g extends t implements DialogInterface {

    public final f f6261f;

    public g(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, e(contextThemeWrapper, i10));
        this.f6261f = new f(getContext(), this, getWindow());
    }

    public static int e(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968615, typedValue, true);
        return typedValue.resourceId;
    }

    @Override
    public void onCreate(Bundle bundle) {
        int i10;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        f fVar = this.f6261f;
        fVar.f6239b.setContentView(fVar.f6256u);
        Context context = fVar.f6238a;
        Window window = fVar.f6240c;
        View viewFindViewById2 = window.findViewById(2131296590);
        View viewFindViewById3 = viewFindViewById2.findViewById(2131296720);
        View viewFindViewById4 = viewFindViewById2.findViewById(2131296402);
        View viewFindViewById5 = viewFindViewById2.findViewById(2131296353);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(2131296406);
        View view = fVar.f6242f;
        if (view == null) {
            view = null;
        }
        boolean z10 = view != null;
        if (!z10 || !f.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131296405);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (fVar.f6243g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (fVar.f6241e != null) {
                ((LinearLayout.LayoutParams) ((w1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(2131296720);
        View viewFindViewById7 = viewGroup.findViewById(2131296402);
        View viewFindViewById8 = viewGroup.findViewById(2131296353);
        ViewGroup viewGroupC = f.c(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupC2 = f.c(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupC3 = f.c(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131296631);
        fVar.f6248m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        fVar.f6248m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupC2.findViewById(16908299);
        fVar.f6252q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            fVar.f6248m.removeView(fVar.f6252q);
            if (fVar.f6241e != null) {
                ViewGroup viewGroup2 = (ViewGroup) fVar.f6248m.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(fVar.f6248m);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(fVar.f6241e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupC2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupC3.findViewById(16908313);
        fVar.h = button;
        a aVar = fVar.A;
        button.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            fVar.h.setVisibility(8);
            i10 = 0;
        } else {
            fVar.h.setText((CharSequence) null);
            fVar.h.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupC3.findViewById(16908314);
        fVar.f6244i = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(fVar.f6245j)) {
            fVar.f6244i.setVisibility(8);
        } else {
            fVar.f6244i.setText(fVar.f6245j);
            fVar.f6244i.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupC3.findViewById(16908315);
        fVar.f6247l = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(null)) {
            fVar.f6247l.setVisibility(8);
        } else {
            fVar.f6247l.setText((CharSequence) null);
            fVar.f6247l.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968613, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = fVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = fVar.f6244i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = fVar.f6247l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupC3.setVisibility(8);
        }
        if (fVar.f6253r != null) {
            viewGroupC.addView(fVar.f6253r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296714).setVisibility(8);
        } else {
            fVar.f6250o = (ImageView) window.findViewById(16908294);
            if (TextUtils.isEmpty(fVar.d) || !fVar.f6259y) {
                window.findViewById(2131296714).setVisibility(8);
                fVar.f6250o.setVisibility(8);
                viewGroupC.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(2131296332);
                fVar.f6251p = textView2;
                textView2.setText(fVar.d);
                Drawable drawable = fVar.f6249n;
                if (drawable != null) {
                    fVar.f6250o.setImageDrawable(drawable);
                } else {
                    fVar.f6251p.setPadding(fVar.f6250o.getPaddingLeft(), fVar.f6250o.getPaddingTop(), fVar.f6250o.getPaddingRight(), fVar.f6250o.getPaddingBottom());
                    fVar.f6250o.setVisibility(8);
                }
            }
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        int i11 = (viewGroupC == null || viewGroupC.getVisibility() == 8) ? 0 : 1;
        boolean z12 = viewGroupC3.getVisibility() != 8;
        if (!z12 && (viewFindViewById = viewGroupC2.findViewById(2131296704)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = fVar.f6248m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = fVar.f6241e != null ? viewGroupC.findViewById(2131296713) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupC2.findViewById(2131296705);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = fVar.f6241e;
        if (alertController$RecycleListView != null && (!z12 || i11 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i11 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f937a, alertController$RecycleListView.getPaddingRight(), z12 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f938b);
        }
        if (!z11) {
            View view2 = fVar.f6241e;
            if (view2 == null) {
                view2 = fVar.f6248m;
            }
            if (view2 != null) {
                int i12 = i11 | (z12 ? 2 : 0);
                View viewFindViewById11 = window.findViewById(2131296630);
                View viewFindViewById12 = window.findViewById(2131296629);
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 23) {
                    WeakHashMap weakHashMap = j0.f46605a;
                    if (i13 >= 23) {
                        c0.b(view2, i12, 3);
                    }
                    if (viewFindViewById11 != null) {
                        viewGroupC2.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupC2.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i12 & 1) == 0) {
                        viewGroupC2.removeView(viewFindViewById11);
                        viewFindViewById11 = null;
                    }
                    if (viewFindViewById12 != null && (i12 & 2) == 0) {
                        viewGroupC2.removeView(viewFindViewById12);
                        viewFindViewById12 = null;
                    }
                    if (viewFindViewById11 != null || viewFindViewById12 != null) {
                        AlertController$RecycleListView alertController$RecycleListView2 = fVar.f6241e;
                        if (alertController$RecycleListView2 != null) {
                            alertController$RecycleListView2.setOnScrollListener(new b(viewFindViewById11, viewFindViewById12));
                            fVar.f6241e.post(new q1(fVar, viewFindViewById11, viewFindViewById12, 1));
                        } else {
                            if (viewFindViewById11 != null) {
                                viewGroupC2.removeView(viewFindViewById11);
                            }
                            if (viewFindViewById12 != null) {
                                viewGroupC2.removeView(viewFindViewById12);
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = fVar.f6241e;
        if (alertController$RecycleListView3 == null || (listAdapter = fVar.f6254s) == null) {
            return;
        }
        alertController$RecycleListView3.setAdapter(listAdapter);
        int i14 = fVar.f6255t;
        if (i14 > -1) {
            alertController$RecycleListView3.setItemChecked(i14, true);
            alertController$RecycleListView3.setSelection(i14);
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6261f.f6248m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6261f.f6248m;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f fVar = this.f6261f;
        fVar.d = charSequence;
        TextView textView = fVar.f6251p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
