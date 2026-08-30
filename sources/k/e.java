package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;
public final class e extends ActionMode {
    public final Context f9509a;
    public final a f9510b;

    public e(Context context, a aVar) {
        this.f9509a = context;
        this.f9510b = aVar;
    }

    @Override
    public final void finish() {
        this.f9510b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f9510b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f9509a, this.f9510b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f9510b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f9510b.e();
    }

    @Override
    public final Object getTag() {
        return this.f9510b.f9501a;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f9510b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f9510b.f9502b;
    }

    @Override
    public final void invalidate() {
        this.f9510b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f9510b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f9510b.j(view);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f9510b.l(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f9510b.f9501a = obj;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f9510b.n(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z4) {
        this.f9510b.o(z4);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f9510b.k(i10);
    }

    @Override
    public final void setTitle(int i10) {
        this.f9510b.m(i10);
    }
}
