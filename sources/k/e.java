package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f13726a;
    public final a f13727b;

    public e(Context context, a aVar) {
        this.f13726a = context;
        this.f13727b = aVar;
    }

    @Override
    public final void finish() {
        this.f13727b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f13727b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f13726a, this.f13727b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f13727b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f13727b.e();
    }

    @Override
    public final Object getTag() {
        return this.f13727b.f13718a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13727b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f13727b.f13719b;
    }

    @Override
    public final void invalidate() {
        this.f13727b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f13727b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f13727b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f13727b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f13727b.f13718a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f13727b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f13727b.o(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f13727b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f13727b.l(i10);
    }
}
