package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f9490a;
    public final a f9491b;

    public e(Context context, a aVar) {
        this.f9490a = context;
        this.f9491b = aVar;
    }

    @Override
    public final void finish() {
        this.f9491b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f9491b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f9490a, this.f9491b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f9491b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f9491b.e();
    }

    @Override
    public final Object getTag() {
        return this.f9491b.f9482a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f9491b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f9491b.f9483b;
    }

    @Override
    public final void invalidate() {
        this.f9491b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f9491b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f9491b.j(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f9491b.l(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f9491b.f9482a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f9491b.n(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z4) {
        this.f9491b.o(z4);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f9491b.k(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f9491b.m(i10);
    }
}
