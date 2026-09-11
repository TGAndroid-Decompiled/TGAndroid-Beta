package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f10139a;
    public final c f10140b;

    public b(c cVar, f fVar) {
        this.f10140b = cVar;
        this.f10139a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f10140b;
        DialogInterface.OnClickListener onClickListener = cVar.f10170j;
        f fVar = this.f10139a;
        onClickListener.onClick(fVar.f10177b, i10);
        if (!cVar.f10172l) {
            fVar.f10177b.dismiss();
        }
    }
}
