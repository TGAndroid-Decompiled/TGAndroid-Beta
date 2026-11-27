package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
public final class d9d extends Fragment implements g36 {
    public static final WeakHashMap b = new WeakHashMap();
    public final pe8 a = new pe8();

    @Override
    public final void a(String str, c36 c36Var) {
        this.a.a(str, c36Var);
    }

    @Override
    public final c36 b(Class cls, String str) {
        return (c36) cls.cast(((Map) this.a.b).get(str));
    }

    @Override
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (c36 c36Var : ((Map) this.a.b).values()) {
            c36Var.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final Activity e() {
        return getActivity();
    }

    @Override
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (c36 c36Var : ((Map) this.a.b).values()) {
            c36Var.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.b(bundle);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        pe8 pe8Var = this.a;
        pe8Var.a = (byte) 5;
        for (c36 c36Var : ((Map) pe8Var.b).values()) {
            c36Var.onDestroy();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        pe8 pe8Var = this.a;
        pe8Var.a = (byte) 3;
        for (c36 c36Var : ((Map) pe8Var.b).values()) {
            c36Var.onResume();
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override
    public final void onStart() {
        super.onStart();
        pe8 pe8Var = this.a;
        pe8Var.a = (byte) 2;
        for (c36 c36Var : ((Map) pe8Var.b).values()) {
            c36Var.onStart();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        pe8 pe8Var = this.a;
        pe8Var.a = (byte) 4;
        for (c36 c36Var : ((Map) pe8Var.b).values()) {
            c36Var.onStop();
        }
    }
}
