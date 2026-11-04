package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f16393a;
    public final a f16394b;

    public e(Context context, a aVar) {
        this.f16393a = context;
        this.f16394b = aVar;
    }

    @Override
    public final void finish() {
        this.f16394b.c();
    }

    @Override
    public final View getCustomView() {
        return this.f16394b.d();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f16393a, this.f16394b.e());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f16394b.f();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f16394b.g();
    }

    @Override
    public final Object getTag() {
        return this.f16394b.f16385b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f16394b.h();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f16394b.f16384a;
    }

    @Override
    public final void invalidate() {
        this.f16394b.i();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f16394b.j();
    }

    @Override
    public final void setCustomView(View view) {
        this.f16394b.m(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f16394b.o(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f16394b.f16385b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f16394b.q(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f16394b.r(z10);
    }

    @Override
    public final void setSubtitle(int i3) {
        this.f16394b.n(i3);
    }

    @Override
    public final void setTitle(int i3) {
        this.f16394b.p(i3);
    }
}
