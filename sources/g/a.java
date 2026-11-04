package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f11642a;
    public final b f11643b;

    public a(b bVar, e eVar) {
        this.f11643b = bVar;
        this.f11642a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j10) {
        b bVar = this.f11643b;
        e eVar = this.f11642a;
        ((DialogInterface.OnClickListener) bVar.f11657m).onClick(eVar.f11683b, i3);
        if (!bVar.f11647a) {
            eVar.f11683b.dismiss();
        }
    }
}
