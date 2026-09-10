package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f8331a;
    public final c f8332b;

    public b(c cVar, f fVar) {
        this.f8332b = cVar;
        this.f8331a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f8332b;
        DialogInterface.OnClickListener onClickListener = cVar.f8341j;
        f fVar = this.f8331a;
        onClickListener.onClick(fVar.f8369b, i10);
        if (!cVar.f8343l) {
            fVar.f8369b.dismiss();
        }
    }
}
