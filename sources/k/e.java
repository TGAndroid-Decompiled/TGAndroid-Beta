package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.b0;
public final class e extends ActionMode {
    public final Context f13115a;
    public final a f13116b;

    public e(Context context, a aVar) {
        this.f13115a = context;
        this.f13116b = aVar;
    }

    @Override
    public final void finish() {
        this.f13116b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f13116b.b();
    }

    @Override
    public final Menu getMenu() {
        return new b0(this.f13115a, this.f13116b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f13116b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f13116b.e();
    }

    @Override
    public final Object getTag() {
        return this.f13116b.f13107a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13116b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f13116b.f13108b;
    }

    @Override
    public final void invalidate() {
        this.f13116b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f13116b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f13116b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f13116b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f13116b.f13107a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f13116b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f13116b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f13116b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f13116b.l(i10);
    }
}
