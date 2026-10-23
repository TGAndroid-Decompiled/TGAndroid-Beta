package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f14574a;
    public final a f14575b;

    public e(Context context, a aVar) {
        this.f14574a = context;
        this.f14575b = aVar;
    }

    @Override
    public final void finish() {
        this.f14575b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f14575b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f14574a, this.f14575b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f14575b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f14575b.e();
    }

    @Override
    public final Object getTag() {
        return this.f14575b.f14566a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f14575b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f14575b.f14567b;
    }

    @Override
    public final void invalidate() {
        this.f14575b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f14575b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f14575b.j(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f14575b.l(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f14575b.f14566a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f14575b.n(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f14575b.o(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f14575b.k(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f14575b.m(i10);
    }
}
