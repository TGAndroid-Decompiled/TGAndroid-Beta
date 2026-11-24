package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;
public final class pt5 {
    public final ArrayList a;
    public final int b;
    public final kr7 c;
    public final gr7 d;
    public final CarText e;

    public pt5(ItemList itemList) {
        this.b = itemList.getSelectedIndex();
        this.c = itemList.getOnSelectedDelegate();
        this.d = itemList.getOnItemVisibilityChangedDelegate();
        this.e = itemList.getNoItemsMessage();
        this.a = new ArrayList(itemList.getItems());
    }
}
