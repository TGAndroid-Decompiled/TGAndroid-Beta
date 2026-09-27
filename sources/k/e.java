package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.b0;
public final class e extends ActionMode {
    public final Context f13106a;
    public final a f13107b;

    public e(Context context, a aVar) {
        this.f13106a = context;
        this.f13107b = aVar;
    }

    @Override
    public final void finish() {
        this.f13107b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f13107b.b();
    }

    @Override
    public final Menu getMenu() {
        return new b0(this.f13106a, this.f13107b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f13107b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f13107b.e();
    }

    @Override
    public final Object getTag() {
        return this.f13107b.f13098a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f13107b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f13107b.f13099b;
    }

    @Override
    public final void invalidate() {
        this.f13107b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f13107b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f13107b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f13107b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f13107b.f13098a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f13107b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f13107b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f13107b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f13107b.l(i10);
    }
}
