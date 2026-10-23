package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f10634a;
    public final b f10635b;

    public a(b bVar, e eVar) {
        this.f10635b = bVar;
        this.f10634a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.f10635b;
        DialogInterface.OnClickListener onClickListener = bVar.f10663j;
        e eVar = this.f10634a;
        onClickListener.onClick(eVar.f10670b, i10);
        if (!bVar.f10665l) {
            eVar.f10670b.dismiss();
        }
    }
}
