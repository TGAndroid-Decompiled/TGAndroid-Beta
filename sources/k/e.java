package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f17672a;
    public final a f17673b;

    public e(Context context, a aVar) {
        this.f17672a = context;
        this.f17673b = aVar;
    }

    @Override
    public final void finish() {
        this.f17673b.b();
    }

    @Override
    public final View getCustomView() {
        return this.f17673b.c();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f17672a, this.f17673b.d());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f17673b.e();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f17673b.f();
    }

    @Override
    public final Object getTag() {
        return this.f17673b.f17664b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f17673b.g();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f17673b.f17663a;
    }

    @Override
    public final void invalidate() {
        this.f17673b.h();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f17673b.j();
    }

    @Override
    public final void setCustomView(View view) {
        this.f17673b.m(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f17673b.p(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f17673b.f17664b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f17673b.r(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f17673b.s(z10);
    }

    @Override
    public final void setSubtitle(int i7) {
        this.f17673b.n(i7);
    }

    @Override
    public final void setTitle(int i7) {
        this.f17673b.q(i7);
    }
}
