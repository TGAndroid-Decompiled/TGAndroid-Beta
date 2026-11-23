package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f18098a;
    public final a f18099b;

    public e(Context context, a aVar) {
        this.f18098a = context;
        this.f18099b = aVar;
    }

    @Override
    public final void finish() {
        this.f18099b.c();
    }

    @Override
    public final View getCustomView() {
        return this.f18099b.d();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f18098a, this.f18099b.e());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f18099b.f();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f18099b.g();
    }

    @Override
    public final Object getTag() {
        return this.f18099b.f18090b;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f18099b.i();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f18099b.f18089a;
    }

    @Override
    public final void invalidate() {
        this.f18099b.j();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f18099b.k();
    }

    @Override
    public final void setCustomView(View view) {
        this.f18099b.n(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f18099b.p(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f18099b.f18090b = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f18099b.r(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f18099b.s(z10);
    }

    @Override
    public final void setSubtitle(int i7) {
        this.f18099b.o(i7);
    }

    @Override
    public final void setTitle(int i7) {
        this.f18099b.q(i7);
    }
}
