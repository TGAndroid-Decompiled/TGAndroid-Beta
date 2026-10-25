package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f16008a;
    public final a f16009b;

    public e(Context context, a aVar) {
        this.f16008a = context;
        this.f16009b = aVar;
    }

    @Override
    public final void finish() {
        this.f16009b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f16009b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f16008a, this.f16009b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f16009b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f16009b.e();
    }

    @Override
    public final Object getTag() {
        return this.f16009b.f16000a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f16009b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f16009b.f16001b;
    }

    @Override
    public final void invalidate() {
        this.f16009b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f16009b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f16009b.i(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f16009b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f16009b.f16000a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f16009b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f16009b.n(z10);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f16009b.j(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f16009b.l(i10);
    }
}
