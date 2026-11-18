package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f12922a;
    public final b f12923b;

    public a(b bVar, e eVar) {
        this.f12923b = bVar;
        this.f12922a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        b bVar = this.f12923b;
        e eVar = this.f12922a;
        ((DialogInterface.OnClickListener) bVar.f12937m).onClick(eVar.f12963b, i7);
        if (!bVar.f12927a) {
            eVar.f12963b.dismiss();
        }
    }
}
